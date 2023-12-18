import java.util.Arrays;
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] values = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Arrays.sort(values);
        
        for (int i = 0; i < k; i++) {
            answer += values[i];
        }

        System.out.println(answer);
    }
}