import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        while (k == 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 || W == 0) {
                break;
            }
            for (int j = 0; j < H; ++j) {
                for (int i = 0; i < W; ++i) {
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
	System.out.printf("\n");
        }
    }
}