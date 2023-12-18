import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        a *= b;
        if (a % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
