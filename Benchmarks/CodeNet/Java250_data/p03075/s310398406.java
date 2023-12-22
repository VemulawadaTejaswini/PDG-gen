import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // シミュレーション
        Scanner sc = new Scanner(System.in);
        int[] antena = new int[6];
        for (int i = 0; i < 6; i++) {
            antena[i] = sc.nextInt();
        }

        int limit = antena[5];
        boolean isJumming = false;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if ((antena[j] - antena[i]) > limit) {
                    isJumming = true;
                }
            }
        }

        System.out.println(isJumming ? ":(" : "Yay!");
    }
}
