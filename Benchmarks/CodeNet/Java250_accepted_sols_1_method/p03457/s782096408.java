import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<List<Integer>> pointList = new ArrayList<>();
        List<Integer> firstPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        firstPoint.add(0);
        pointList.add(firstPoint);

        for (int i = 0; i < N; i++) {
            List<Integer> tmpPoint = new ArrayList<>();
            tmpPoint.add(Integer.parseInt(sc.next()));
            tmpPoint.add(Integer.parseInt(sc.next()));
            tmpPoint.add(Integer.parseInt(sc.next()));
            pointList.add(tmpPoint);
        }

        for (int i = 0; i < N; i++) {
            List<Integer> currentPoint = pointList.get(i);
            List<Integer> nextPoint = pointList.get(i + 1);
            int diff = Math.abs(currentPoint.get(1) - nextPoint.get(1) + currentPoint.get(2) - nextPoint.get(2));
            int diffTime = nextPoint.get(0) - currentPoint.get(0);

            if (!(diff <= diffTime && diff % 2 == diffTime % 2)) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}