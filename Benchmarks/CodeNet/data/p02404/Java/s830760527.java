import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, W;
        while (true) {
            H = sc.nextInt();
            W = sc.nextInt();
            int i, k;
            for (i = 0; i < H; i++) {
                for (k = 0; k < W; k++) {
                    if (0 < k & 0 < i & k < W - 1 & i < H - 1) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }
            if (H == 0 && W == 0)
                break;
            System.out.println("");
        }
    }
}
