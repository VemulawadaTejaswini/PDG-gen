import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String args[]) { 

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;
        int[] arr1 = new int[N];
        int[] arr2 = new int[M];
        int k=2;
        for(int i=0; i<N; i++){
            arr1[i] = k;
            k = k + 2;
        }
        int j = 1;
        for(int i=0; i<M; i++){
            arr2[i] = j;
            j = j + 2;
        }

        for(int i=0; i<(arr1.length); i++){
            for(int p=(i+1); p<(arr1.length); p++) {
                if(((arr1[i] + arr1[p]) & 1) == 0)
                count++;
            }
        }

        for(int i=0; i<(arr2.length); i++){
            for(int p=(i+1); p<(arr2.length); p++) {
                if(((arr2[i] + arr2[p]) & 1) == 0)
                count++;
            } 
        }
        System.out.println(count);
        

        sc.close();
    }
}
    