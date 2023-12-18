import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) break;
            solve(h, w);
            System.out.println("");
        }
    }
    
    private static void solve(int h, int w) {
        for (int i = 0;i < h;i++) {
            System.out.println(line(i, h, w));
        }
    }
    
    private static String line(int idx, int h, int w) {
        StringBuilder sb = new StringBuilder();
        if (idx == 0 || idx == h-1) {
            for (int i = 0;i < w;i++) sb.append("#");
        } else {
            sb.append("#");
            for (int i = 0;i < w-2;i++) sb.append(".");
            sb.append("#");
        }
        return sb.toString();
    }
}