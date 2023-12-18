import java.util.Scanner;

public class Main {
    static int n;
    static int[] a;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n%2==0) {
            System.out.println(n/2);
        } else {
            System.out.println(n/2+1);
        }
    }

}