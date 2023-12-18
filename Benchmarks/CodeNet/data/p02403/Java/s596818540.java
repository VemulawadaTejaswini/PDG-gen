import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int H = input.nextInt();
            int W = input.nextInt();
            if (H == 0 && W == 0) break;
            char[] cs = new char[W];
            Arrays.fill(cs, '#');
            for (int i = 0; i < H; i++) {
                System.out.println(cs);
            }
            System.out.println();
        }
    }
}