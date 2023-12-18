import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), P = s.nextInt();
        System.out.println((A * 3 + P) / 2);
    }
}