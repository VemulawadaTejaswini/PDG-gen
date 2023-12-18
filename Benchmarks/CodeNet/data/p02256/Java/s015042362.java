import java.util.Random;
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt(), b = x.nextInt();
        System.out.println(gcd(a, b));
    }
    static int gcd(int a, int b){
        while (b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}