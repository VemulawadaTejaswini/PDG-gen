import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        for(int i=0; i<n; i++) {
            v1[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            v2[i] = sc.nextInt();
        }

        sc.close();

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double inf = 0.0;

        for(int i=0; i<n; i++) {
            p1 += Math.abs(v1[i]-v2[i]);
            p2 += Math.pow(Math.abs(v1[i]-v2[i]),2);
            p3 += Math.pow(Math.abs(v1[i]-v2[i]),3);
            inf = Math.max(inf, Math.abs(v1[i]-v2[i]));
        }

        System.out.println(String.format("%.6f",p1));
        System.out.println(String.format("%.6f",Math.sqrt(p2)));
        System.out.println(String.format("%.6f",Math.cbrt(p3)));
        System.out.println(String.format("%.6f",inf));

    }
}

