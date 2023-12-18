import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println(comp(
                scan.nextInt() , scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
    }

    private static String comp(int w,int h,int x,int y,int r) {
        if (!(-100 <= x || y <=100 || 0 < w || r <= 100)) {
            return "";
        }
        if (circle_in_a_Rectangle(w,x,r) && circle_in_a_Rectangle(h,y,r)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    // 水平方向 (垂直方向も同様)
    // x - r が0 より小さい、または、x + r がW より大きいならばNoと判定。
    // x - r が0 以上、かつ、x + r がW 以下ならばYesと判定。
    private static boolean circle_in_a_Rectangle(int w,int x,int r) {
        int a = x - r;
        int b = x + r;
        if (a < 0 || b > w) {
            return false;
        } else if (a >= 0 && b <= w) {
            return true;
        } else {
            return false;
        }
    }
}