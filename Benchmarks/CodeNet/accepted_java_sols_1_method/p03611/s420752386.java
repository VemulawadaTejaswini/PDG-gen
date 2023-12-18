import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[100005];
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt()+1;
            a[x-1] += 1;
            a[x] += 1;
            a[x+1] += 1;
        }
        long answer = 0;
        for (int i = 0; i < 100005; i++) {
            answer = Math.max(answer, a[i]);
        }
        System.out.println(answer);
    }
}
