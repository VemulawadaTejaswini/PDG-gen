import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String bStr = scan.next();
        int b = Integer.parseInt(bStr);
        int digits = bStr.length();
        a *= Math.pow(10, digits);
        a += b;
        for (int i = 0; i <= Math.sqrt(a); i++) {
            if (i * i == a ) {
                System.out.println("Yes"); return;
            }
        }
        System.out.println("No");
    }
}