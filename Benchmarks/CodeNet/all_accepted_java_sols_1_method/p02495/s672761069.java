import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H, W;
        String s;

        while (true) {
            H = sc.nextInt();
            W = sc.nextInt();

            if (H == 0 && W == 0) break;

            for (int i = 0; i < H; i++) {
                s = "";
                for (int j = 0; j < W; j++) {
                    s += (i + j) % 2 == 0 ? "#" : ".";
                }
                System.out.println(s);
            }
            System.out.println();
        }
    }
}