import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt() + 2;
        int w = sc.nextInt() + 2;
        String[] line = new String[h - 2];
        for (int i = 0; i < h - 2; i++) {
            line[i] = sc.next();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h -1 || j == 0 || j == w - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(line[i - 1].charAt(j - 1));
                }
            }
            System.out.println();
        }
    }
}
