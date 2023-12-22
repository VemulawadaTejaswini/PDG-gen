import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for (int i = 0; i < i1; i++) {
            listX.add(sc.nextInt());
        }

        for (int i = 0; i < i1; i++) {
            listY.add(sc.nextInt());
        }
        int max = 0;

        for (int i = 0; i < i1; i++) {

            int tmpMax = 0;

            for (int j = 0; j < i1; j++) {
                if (i > j) {
                    tmpMax = tmpMax + listX.get(j);
                } else if (i == j) {
                    tmpMax = tmpMax + listX.get(j);
                    tmpMax = tmpMax + listY.get(j);
                } else {
                    tmpMax = tmpMax + listY.get(j);
                }
            }
            if (max < tmpMax) {
                max = tmpMax;
            }
        }
        System.out.println(max);
    }
}

