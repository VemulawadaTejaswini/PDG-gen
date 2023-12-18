import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] n = new long[t];
        int[] a = new int[t];
        int[] b = new int[t];
        int[] c = new int[t];
        int[] d = new int[t];
        for (int i = 0; i<t; i++) {
            n[i] = sc.nextLong();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        String rt = "";
        System.out.println(rt);
    }
}