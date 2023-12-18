import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        String s = sc.next();

        boolean b1 = !s.substring(a, c).contains("##");
        boolean b2 = !s.substring(b, d).contains("##");

        boolean res = false;
        res = b1 && b2;
        if(c > d) {
            res &= s.substring(b-1, d+2).contains("...");
        }
        System.out.println(res ? "Yes" : "No");
    }
}
