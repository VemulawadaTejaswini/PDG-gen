import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mask = "#..#";

        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 && W == 0)
                break;
            
            for (int row = 0; row < H; row++) {
                for (int col = 0; col < W; col++)
                    System.out.print(mask.charAt((col % 2) + (row % 2 * 2)));
                System.out.println();
            }
            System.out.println();
        }
    }
}

