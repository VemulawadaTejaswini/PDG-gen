import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) break;
            for (int i = 0; i < h; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < w; j++) {
                    sb.append("#");
                }
                System.out.println(sb.toString());
            }
            System.out.println("");
        }
    }
}