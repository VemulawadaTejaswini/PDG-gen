import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] l = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            l[i] = scan.nextInt();
            sum += l[i];
        }
        Arrays.sort(l);
        boolean answer = l[N-1] < sum - l[N-1] ? true : false;
        System.out.printf(answer ? "Yes" : "No");
    }
}
