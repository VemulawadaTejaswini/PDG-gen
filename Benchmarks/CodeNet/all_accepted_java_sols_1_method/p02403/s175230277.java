import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int H = scn.nextInt();
            int W = scn.nextInt();
            if(H == 0 && W == 0) {
                break;
            }
            char[] buf = new char[W];
            Arrays.fill(buf, '#');
            String lin = new String(buf);
            for(int i = 0; i < H; i++) {
                System.out.println(lin);
            }
            System.out.println();
        }
    }
}