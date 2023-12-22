import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        int N = Integer.parseInt(values[0]);
        int D = Integer.parseInt(values[1]);
        List<List<Integer>> list = new ArrayList();

        for (int i = 0; i < N; i++) {
            String[] points = scanner.nextLine().split(" ");
            List<Integer> pointList = new ArrayList();

            for (int j = 0; j < D; j++) {
                pointList.add(Integer.parseInt(points[j]));
            }

            list.add(pointList);
        }

        int answer = 0;

        for (int i = 0; i < N - 1; i++) {

            List<Integer> current = list.get(i);
        

            for (int j = i + 1; j < N; j++) {

                List<Integer> target = list.get(j);

                double sum = 0;
                for (int k = 0; k < D; k++) {
                    double pow = (target.get(k) - current.get(k)) * (target.get(k) - current.get(k));
                    sum = sum + pow;

                }

                double distance = Math.sqrt(sum);
        

                int x = (int) distance;
                if ((x - distance) == 0.0) {
                    answer++;
                }
            }

        }

        System.out.println(answer);

        scanner.close();

    }

}