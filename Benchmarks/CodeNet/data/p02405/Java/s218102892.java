import java.util.*;
 
class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        while (true) {
            int h = sc.nextInt(); int w = sc.nextInt();
            if (h==0 && w==0) return;
             
            for (int i=0; i<h; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<w; j++) {
                    if (i%2==0) {
                        if (j%2==0) sb.append("#");
                        else sb.append(".");
                    }
                    else {
                        if (j%2==0) sb.append(".");
                        else sb.append("#");
                    }
                }
                System.out.println(sb);
            }
             
            System.out.println();
        }
         
    }
}
