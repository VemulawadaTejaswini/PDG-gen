import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ABC178EPoint[] points = new ABC178EPoint[n];
        for(int i=0; i<n; i++) {
            ABC178EPoint point = new ABC178EPoint();
            point.x = in.nextLong();
            point.y = in.nextLong();
            points[i] = point;
        }

        Arrays.sort(points, new ABC178EPoint1());
        long ans1 = Math.abs(points[0].x - points[n-1].x) + Math.abs(points[0].y - points[n-1].y);
        Arrays.sort(points, new ABC178EPoint2());
        long ans2 = Math.abs(points[0].x - points[n-1].x) + Math.abs(points[0].y - points[n-1].y);

        System.out.println(Math.max(ans1, ans2));
    }
}
class ABC178EPoint {
    long x;
    long y;
}
class ABC178EPoint1 implements Comparator<ABC178EPoint> {
    // y=x+a の直線と衝突する順番。切片の順番。 a=y-x
    @Override
    public int compare(ABC178EPoint o1, ABC178EPoint o2) {
        long ans = (o1.y-o1.x) - (o2.y-o2.x);
        return ans<0 ? -1 : (ans>0 ? 1 : 0);
    }
}
class ABC178EPoint2 implements Comparator<ABC178EPoint> {
    // y=-x+a の直線と衝突する順番。切片の順番。a=y+x
    @Override
    public int compare(ABC178EPoint o1, ABC178EPoint o2) {
        long ans = (o1.x+o1.y) - (o2.x+o2.y);
        return ans<0 ? -1 : (ans>0 ? 1 : 0);
    }
}
