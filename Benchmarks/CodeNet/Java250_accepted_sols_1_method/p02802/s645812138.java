import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] t = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt() - 1;
            String s = sc.next();
            if (s.contains("AC")) {
                t[v] = 1;
            } else if (t[v] != 1){
                f[v] += 1;
            }
        }

        //解析
        long ct_t = 0;
        long ct_f = 0;
        for (int i = 0; i < n; i++) {
            ct_t += (t[i] == 0)? 0 : 1;
            ct_f += (t[i] == 0)? 0 : f[i];
        }

        System.out.println(ct_t + " " + ct_f);
    }
}