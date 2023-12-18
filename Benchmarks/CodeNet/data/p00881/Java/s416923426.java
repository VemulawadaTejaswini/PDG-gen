import java.util.Scanner;

public class Main{
    static int[][] data = new int[128][11];
    static int musi[] = new int[128];
    static int yes[] = new int[128];
    static int no[] = new int[128];
    static int length, num;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<128;i++){
            musi[i] = i;
            yes[i] = i;
            no[i] = i;
        }
        while(true){
            length = sc.nextInt();
            num = sc.nextInt();
            if((length|num)==0) break;
            String[] str = new String[num];
            for(int i=0;i<num;i++) str[i] = sc.next();
            for(int i=0;i<num;i++) for(int j=0;j<length;j++) data[i][j] = str[i].charAt(j) - '0';
            System.out.println(solve(num, 0, 0, musi));
        }
    }
    static int solve(int n, int j,int a, int[] b){
        if(n==1) return 0;
        if(j==length) return length;
        int countyes=0, countno=0, p=0, q=0, x=0, y=0, z=0;
        for(int i=0;i<n;i++){
            if(data[b[i]][j] == 1){
                countyes++;
                yes[p] = i;
                p++;
            }
            else{
                countno++;
                no[q] = i;
                q++;
            }
        }
        x = solve(n, j+1, a, musi);
        y = solve(countyes, j+1, a+1, yes)+1;
        z = solve(countno, j+1, a+1, no)+1;
        return Math.min(x, Math.max(y, z));
    }
}
