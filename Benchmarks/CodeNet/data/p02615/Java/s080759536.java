import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        
        int sum = 0;
        for(int i = a.length - 1; i > 0; i--){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
