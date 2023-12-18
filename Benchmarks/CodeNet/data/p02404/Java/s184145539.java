import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int H;
    private static int W;
    public static void main(String[] args) throws Exception {
        H = sc.nextInt();
        W = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < H;i++) {
            System.out.println(line(i, W));
        }
    }
    
    private static String line(int h, int w) {
        StringBuilder sb = new StringBuilder();
        if (h == 0 || h == H-1) {
            for (int i = 0;i < w;i++) sb.append("#");
        } else {
            sb.append("#");
            for (int i = 0;i < w-2;i++) sb.append(".");
            sb.append("#");
        }
        return sb.toString();
    }
}