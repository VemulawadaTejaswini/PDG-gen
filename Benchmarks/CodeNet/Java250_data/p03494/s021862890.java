import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] series = new int[num];

        for (int i = 0; i < num; i++) {
            series[i] = sc.nextInt();
        }

        boolean isEven = isEven(series);
        int count = 0;
        while (isEven) {
            count++;

            for (int i = 0; i < num; i++) {
                series[i] /= 2;
            }
            isEven = isEven(series);
        }

        System.out.println(count);
    }

    private static boolean isEven(int[] series) {
        boolean isEven = true;
        for (int i = 0; i < series.length; i++) {
            if (series[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }

        return isEven;
    }
}
