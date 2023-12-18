import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int rest = n%k;
        int val = n/k;
        
        int[] arr = new int[k];
        arr[0] = val;
        for(int i = 1; i < k; i++){
            arr[i] = val;
            if(i <= rest) arr[i]++;
        }
        
        long res = 0;
        
        if((k & 1) == 1){
            long temp = 1;
            temp *= arr[0];
            temp *= arr[0];
            temp *= arr[0];
            
            res += temp;
            System.out.println(res);
            return;
        }
        else{
            long temp1 = 1;
            long temp2 = 1;
            for(int i = 0; i < 3; i++){
                temp1 *= arr[0];
                temp2 *= arr[k >> 1];
            }
            res += temp1 + temp2;
            System.out.println(res);
            return;
        }

    }
}
