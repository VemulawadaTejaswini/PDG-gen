import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static char[][] ary;
    private static boolean[][] b;
    private static int h;
    private static int w;
    public static void main(String[] args) throws Exception {
        h = sc.nextInt();
        w = sc.nextInt();
        int num = 0;
        for (int i = 0;i < h;i++) {
            String s = sc.next();
            for (int j = 0;j < w;j++) {
                if (s.charAt(j)=='#') num++;
            }
        }
        
        if (h+w-1==num) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
