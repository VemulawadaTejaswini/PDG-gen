import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        long res = 0;
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();

        if (ch[0] == 'A' && ch[1] == 'R' && ch[2] == 'C') {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }

        // System.out.println(res);
        sc.close();
    }
}
