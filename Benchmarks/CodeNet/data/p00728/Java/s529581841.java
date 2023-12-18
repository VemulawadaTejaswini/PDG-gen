import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            sum = 0;
            n = sc.nextInt();
            if(n == 0) break;
            double data[] = new double[n];
            for(int i=0;i<n;i++){
                data[i] = (double)sc.nextInt();
            }
            Arrays.sort(data);
            for(int i=1;i<n-1;i++){
                sum += data[i];
            }
            System.out.printf("%.0f\n", sum / (n-2));
        }
    }
}