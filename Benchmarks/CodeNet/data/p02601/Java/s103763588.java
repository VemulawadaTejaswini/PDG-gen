import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt(), K = scanner.nextInt();
        System.out.println(max1(A,B,C,K)?"Yes":"No");
        /*if (A>=1800) {
            System.out.println(1);
        } else if (A>=1600)
            System.out.println(2);
        else if (A>=1400)
            System.out.println(3);
        else if (A>=1200)
            System.out.println(4);
        else if (A>=1000)
            System.out.println(5);
        else if (A>=800)
            System.out.println(6);
        else if (A>=600)
            System.out.println(7);
        else if (A>=400)
            System.out.println(8);*/
    }

    private static boolean max1(int a, int b, int c, int k) {
        boolean ans = true;
        while (k>0) {
            if (b<=a) {
                b*=2;
                k--;
            } else if (c<=b) {
                c*=2;
                k--;
            }
            if (c>b&&b>a)
                break;
        }
        return c>b&&b>a;
    }

}
