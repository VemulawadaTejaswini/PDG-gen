import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for(int i = 0; i < n; i++){
           x[i] = sc.nextInt();
           y[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(x[i] * x[i] + y[i] * y[i] <= d * d){
                count++;
            }
        }
        System.out.println(count);
    }

} 
