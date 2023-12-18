import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] red = new int[n][2];
        int[][] blue = new int[n][2];
        for (int i = 0; i < n; i++) {
            red[i][0] = sc.nextInt();
            red[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            blue[i][0] = sc.nextInt();
            blue[i][1] = sc.nextInt();
        }

        Arrays.sort(red, Comparator.comparingInt(x -> x[1]));
        Arrays.sort(blue, Comparator.comparingInt(x -> x[0]));

        int count = 0;
        boolean[] paired = new boolean[n];
        for (int i = 0; i < n; i++) {
            int blueX = blue[i][0];
            int blueY = blue[i][1];
            for (int j = n - 1; j >= 0; j--) {
                int redX = red[j][0];
                int redY = red[j][1];
                if (paired[j] || redX >= blueX || redY >= blueY) {
                    continue;
                }
                count++;
                paired[j] = true;
                break;
            }
        }
        System.out.println(count);
    }

}
