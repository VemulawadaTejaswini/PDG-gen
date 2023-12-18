import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int T = scan.nextInt();
        int A = scan.nextInt();
        float[] arr = new float[n];
        
        for(int i = 0; i < n; i++) arr[i] = (float)Math.abs(A - (T - 0.006 * scan.nextInt()));
        
        int res_index = 0;
        float min = Float.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                res_index = i+1;
                min = arr[i];
            }
        }
        
        System.out.println(res_index);
    }
}
