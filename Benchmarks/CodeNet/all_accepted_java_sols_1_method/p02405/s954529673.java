import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = 0;
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0)
                break;
            for (int y = 0; y < H; y++) {
                int binary = i % 2;
                    i += 1;
                for (int x = 0; x < W; x++) {
                    if (x % 2 == binary) {
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
