import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] x = new int[5];
            for (int i = 0; i < x.length; i++) {
                x[i] = sc.nextInt();
            }

            for (int i = 0; i < x.length; i++) {
                if (x[i] != (i + 1)) {
                    System.out.println(i + 1);
                }
            }
        }
    }
}
