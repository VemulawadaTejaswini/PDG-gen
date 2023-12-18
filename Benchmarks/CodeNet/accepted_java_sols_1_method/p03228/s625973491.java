import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if(i % 2 == 0) {
                if(a % 2 == 1) {
                    a--;
                }
                b += a / 2;
                a /= 2;
            } else {
                if(b % 2 == 1) {
                    b--;
                }
                a += b / 2;
                b /= 2;
            }
        }
        System.out.println(a + " " + b);
    }
}