import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n-1];
        int s[] = new int[n-1];
        int f[] = new int[n-1];
        for(int i = 0; i < n-1; i++){
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }

        for(int j = 0; j < n-1; j++) {
            int t = 0;
            for (int i = j; i < n - 1; i++) {
                if (t <= s[i]) {
                    t = s[i];
                    t += c[i];
                } else if (t % f[i] == 0) {
                    t += c[i];
                } else {
                    t +=f[i] - t % f[i] + c[i];
                }
            }
            System.out.println(t);
        }
        System.out.println(0);
    }
}