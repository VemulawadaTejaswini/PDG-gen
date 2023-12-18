import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            int[] tower = new int[1000];
            for (int i = 1; i < tower.length; i++) {
                tower[i] = i + tower[i - 1];
            }

            for (int i = 1; i + 1 < tower.length; i++) {
                int x = tower[i] - a;
                if (x < 0) {
                    continue;
                }
                if (x + b == tower[i + 1]) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
