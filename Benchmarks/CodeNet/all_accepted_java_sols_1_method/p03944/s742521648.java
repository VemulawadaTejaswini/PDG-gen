import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int x,y,a = 0;

        int xh = 0;
        int xe = W;
        int yh = 0;
        int ye = H;

        for(int i = 0; i<N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            if(a == 1) {
                xh = Math.max(xh, x);
            }else if(a == 2) {
                xe = Math.min(xe, x);
            }else if(a == 3) {
                yh = Math.max(yh, y);
            }else {
                ye = Math.min(ye, y);
            }
        }
        //System.out.println(xh+" "+xe+" "+yh+" "+ye);
        if(xe-xh<0 || ye-yh<0) System.out.println(0);
        else System.out.println((xe-xh)*(ye-yh));
    }
}