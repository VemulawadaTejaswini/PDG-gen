import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = gcd(a, b);
        System.out.println(answer);
    }

    public static int gcd(int a,  int b){

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a >= b) {
            a = a % b;
        } else {
            b = b % a;
        }
        return gcd(a, b);
    }

}
