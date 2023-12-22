import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int maxValue = 0;
        int maxIndex = 0;
        int secondMaxValue = 0;
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(sc.next());
            if (tmp > maxValue) {
                maxValue = tmp;
                maxIndex = i;
            } else if (tmp > secondMaxValue) {
                secondMaxValue = tmp;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i == maxIndex) {
                builder.append(secondMaxValue);
            } else {
                builder.append(maxValue);
            }
            builder.append("\n");
        }

        System.out.println(builder.toString());
    }
}