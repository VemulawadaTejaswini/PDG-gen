import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int rem = (X - A) % B;
        System.out.println(rem);
    }

}