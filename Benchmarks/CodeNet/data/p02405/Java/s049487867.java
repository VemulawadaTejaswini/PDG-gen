import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String headnext="#";
            String next = "#";
            int h = sc.nextInt(), w = sc.nextInt();
            if (h == 0 && w == 0) break;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(next);
                    if ("#".equals(next)) next = ".";
                    else next = "#";
                }
                System.out.println();
                if ("#".equals(headnext)) {
                    headnext = ".";
                    next = headnext;
                }
                else {
                    headnext = "#";
                    next = headnext;
                }
            }
            System.out.println();
        }
    }
}
