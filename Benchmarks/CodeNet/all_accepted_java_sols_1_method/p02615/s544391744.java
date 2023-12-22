import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        long sum = 0;
        sum += (long) arr[N - 1];
        count++;
        int i = N - 2;

        while(count < N - 1) {
            sum += (long) arr[i];
            count += 1;

            if(count + 1 < N) {
                sum += (long) arr[i];
                count += 1;
                i--;
            }
        }

        System.out.println(sum);
    }
}
