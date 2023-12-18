import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            b[a.length - 1 - i] = a[i];
        }
        int sum = 0;
        for(int i = 0; i < a.length-1; i++){
            sum += b[i];
        }
        System.out.println(sum);
    }
}
