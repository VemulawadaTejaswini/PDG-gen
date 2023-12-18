import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int h, w;
        while((h = scn.nextInt()) != 0 | (w = scn.nextInt()) != 0) {
            check(h, w);
            System.out.println();
        }
    }
    
    private static void check(int h, int w) {
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if((i + j) % 2 > 0) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}