import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long sum = 1;
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        boolean zero = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zero = true;
            }
        }

        if(zero){
            sum = 0;
        } else{
            for(int i = 0; i < n; i++){
                if(arr[i] <= (long) Math.pow(10, 18) / sum){
                    sum *= arr[i];
                } else{
                    sum = -1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}