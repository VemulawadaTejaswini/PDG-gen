import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H;
        int W;
        while ((H = scanner.nextInt()) != 0 && (W = scanner.nextInt()) != 0) {
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    System.out.print('#');
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
