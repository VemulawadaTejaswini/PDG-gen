import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Christmas");
        for (int i = a; i < 25; i++) {
            System.out.print(" Eve");
        }
        System.out.println("");
    }
}