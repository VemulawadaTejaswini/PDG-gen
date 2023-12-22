import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, w;
        while (true) {
            h = sc.nextInt();
            w = sc.nextInt();
            if (h == 0 && w == 0) return;
            for (int i=0; i<h; i++) {
                String s="";
                for (int j=0; j<w; j++) {
                    if (i == 0 || i == h-1 || j == 0 || j == w-1)  s += "#";
                    else s += ".";
                }
                System.out.println(s);
            }
            System.out.println();
        }
    }
}