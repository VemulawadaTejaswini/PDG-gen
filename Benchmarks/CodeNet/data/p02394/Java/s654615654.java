import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W,H,x,y,r;
        W = input.nextInt();
        H = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        r = input.nextInt();
        int up,down,left,right;
        up = y + r;
        down = y - r;
        left = x - r;
        right = x + r;
        String ans;
        if ((up <= H) && (down >= 0) && (left >= 0) && (right <= W)) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);

    }
}
