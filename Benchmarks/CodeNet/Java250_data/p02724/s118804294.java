import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        System.out.println((X/500)*1000 + (X%500)/5 * 5);
    }
}
