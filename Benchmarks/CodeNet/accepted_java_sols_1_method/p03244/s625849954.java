import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] firstT = new int[100001];
        int[] secondT = new int[100001];

        int partLength = n / 2;

        for (int i = 0; i < partLength; i++) {
            firstT[sc.nextInt()]++;
            secondT[sc.nextInt()]++;
        }

        ArrayList<Point> firstL = new ArrayList<>();
        ArrayList<Point> secondL = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            if (firstT[i] > 0) {
                firstL.add(new Point(i, partLength -  firstT[i]));
            }
            if (secondT[i] > 0) {
                secondL.add(new Point(i, partLength -  secondT[i]));
            }
        }
        firstL.sort(Comparator.comparingInt(a -> a.y));
        secondL.sort(Comparator.comparingInt(a -> a.y));

        long ans = Long.MAX_VALUE;

        for(Point f : firstL) {
            for (Point s : secondL) { 
                boolean isSame =  f.x == s.x;
                ans = Math.min(ans, isSame ? f.y + partLength : f.y + s.y);
                if (!isSame) { 
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}