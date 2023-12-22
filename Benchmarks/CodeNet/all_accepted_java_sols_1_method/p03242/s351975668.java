import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int trueN = (n / 100 == 1 ? 900 : 100) + ((n % 100) / 10 == 1 ? 90 : 10) + (n % 10 == 1 ? 9 : 1);
            System.out.println(trueN);
        }
    }
}
