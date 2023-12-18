import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        while(true){
        int n = scanner.nextInt();
            
            if(n == 0) {
                return;
            }
        
        int[] arr = inputIntArray(n);
        
        double ave = 0;
        for(int i = 0; i < n; ++i) {
            ave += arr[i];
        }
        ave /= n;
        
        double a = 0.;
        for(int i = 0; i < n; ++i) {
            a += (arr[i] - ave) * (arr[i] - ave);
        }
        a /= n;
        
        System.out.println(Math.sqrt(a));
        }
    }
}
