import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        int mindex = 0;
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();

        }
        Arrays.sort(s);
        int sum = Arrays.stream(s).sum();
        int copy = sum;
        while (sum % 10  == 0){
            if (s[mindex] % 10 != 0){
                sum -= s[mindex];
            }
            mindex++;
            if (mindex == n && sum == copy){
                sum = 0;
                break;
            }
        }
        System.out.println(sum);
    }
}
