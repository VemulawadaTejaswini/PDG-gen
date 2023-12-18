import java.util.Scanner;
public class ALDS1_1_B {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt(), b = x.nextInt();

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