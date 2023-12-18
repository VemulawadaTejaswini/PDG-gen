import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (Math.abs(c - a) <= d ||  (Math.abs(a-b) <=d && Math.abs(b-c) <= d))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
