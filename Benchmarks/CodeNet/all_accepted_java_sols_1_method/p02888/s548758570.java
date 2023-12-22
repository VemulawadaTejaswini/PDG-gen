import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] lengths = new Integer[n];
        for (int j = 0; j < n; j++) {
            lengths[j] = in.nextInt();
        }
        Arrays.sort(lengths);
        long answer = 0;
        for (int j = 0; j < n; j++) {
            for (int k = j + 1, l = j + 2; k < n; k++) {
                while (l < n && lengths[j] + lengths[k] > lengths[l]) {
                    l++;
                }
                answer += (long) (l - k - 1);
            }
        }
        System.out.println(answer);
    }
}
