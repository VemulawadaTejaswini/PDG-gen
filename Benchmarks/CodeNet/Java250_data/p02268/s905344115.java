
import java.util.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       
       Scanner scner = new Scanner(System.in);

        int n = scner.nextInt();
        int[] S = new int[n];
        for (int i=0; i<n; i++) {
            S[i] = scner.nextInt();
        }

        int q = scner.nextInt();
        int T = 0;
     
        int num = seSearch(S, T, q, scner);
        System.out.println(num);
       }

    public static int seSearch(int[] a, int b, int f,Scanner c){
     int solve = 0;
     for (int i=0; i<f; ++i){
      b = c.nextInt();
     if (Arrays.binarySearch(a,b) >= 0) {
                solve++;
            }
        
        
    
}
    return solve;

 } 
     }
