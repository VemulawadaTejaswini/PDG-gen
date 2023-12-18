import java.util.Scanner;

public class Main {
    static int n;
    static Circle circle[] = new Circle[24];
    static int[] state = new int[20000000];
    static int[] two = new int[25];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        powTwo();

        while (true){
            n = sc.nextInt();
            if (n==0) break;

            for (int i = 0; i < 20000000; i++) {
                state[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                circle[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                overCircle(i);
            }

            System.out.println(remove(0, 0));
        }
    }

    static void powTwo() {
        two[0] = 1;
        for (int i = 1; i < 25; i++) {
            two[i] = two[i-1]*2;
        }
    }

    static void overCircle(int i) {
        for (int j = 0; j < i; j++) {
            int l = (int)(Math.pow(circle[j].x-circle[i].x,2)+Math.pow(circle[j].y-circle[i].y,2));
            if (Math.pow(circle[j].r+circle[i].r,2)>l){
                circle[i].over[j] = 1;
                circle[i].cnt++;
            }
        }
    }

    static int remove(int cnt, int s) {
        state[s] = 1;
        int ans = cnt;

        for (int i = 0; i < n; i++) {
            if (circle[i].flag==1 || circle[i].cnt>0) continue;

            for (int j = i+1; j < n; j++) {
                if (circle[j].flag==0&&circle[j].cnt==0&&circle[i].c==circle[j].c){
                    if (state[s+two[i]+two[j]]==1) continue;
                    circle[i].flag = circle[j].flag = 1;
                    for (int k = 0; k < n; k++) {
                        if (circle[k].over[i]==1) circle[k].cnt--;
                        if (circle[k].over[j]==1) circle[k].cnt--;
                    }
                    ans = Math.max(remove(cnt+2, s+two[i]+two[j]), ans);
                    circle[i].flag = circle[j].flag = 0;
                    for (int k = 0; k < n; k++) {
                        if (circle[k].over[i]==1) circle[k].cnt++;
                        if (circle[k].over[j]==1) circle[k].cnt++;
                    }
                }
            }
        }
        return ans;
    }

    static class Circle{
        int x, y, r, c;
        int[] over = new int[24];
        int cnt = 0, flag = 0;
        Circle(int s, int t, int u, int v){
            x = s; y = t; r = u; c = v;
        }
    }
}