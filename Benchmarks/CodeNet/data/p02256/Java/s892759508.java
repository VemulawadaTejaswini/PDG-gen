import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
        sc.close();
    }

    public static int gcd(int x, int y) {
        if(x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        while(y > 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }
        return x;
    }
}
