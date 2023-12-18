import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[5];
        for (int i = 0; i < 5; i++) {
            X[i] = sc.nextInt();
        }

        if (X[0] == 0) {
            System.out.println("1");
        }
        if (X[1] == 0) {
            System.out.println("2");
        }

        if (X[2] == 0) {
            System.out.println("3");
        }

        if (X[3] == 0) {
            System.out.println("4");
        }

        if (X[4] == 0) {
            System.out.println("5");
        }

    }
}