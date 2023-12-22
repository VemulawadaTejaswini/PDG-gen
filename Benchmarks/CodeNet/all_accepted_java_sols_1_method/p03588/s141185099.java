import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] data = new int[N][2];
        for (int i  = 0; i < N; i++) {
            data[i][0] = sc.nextInt()-1;
            data[i][1] = sc.nextInt();
        }
        Arrays.sort(data, Comparator.comparing((int[] i) -> i[1]));
        int x = data[0][0] + data[0][1] + 1;
        System.out.println(x);
    }
}