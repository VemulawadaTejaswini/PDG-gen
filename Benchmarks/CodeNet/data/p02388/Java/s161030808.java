import java.util.Scanner;
public class Main {
    public static void main(String args[] ) {
        int n = (new Scanner(System.in).nextInt());
        Double pow = Math.pow(n, 3);

        System.out.println(pow.intValue());
    }
}