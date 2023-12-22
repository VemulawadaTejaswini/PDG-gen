import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((0 <= i && i < B && 0 <= j && j < A)
                    ||(B <= i && i < H && A <= j && j < W)) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
