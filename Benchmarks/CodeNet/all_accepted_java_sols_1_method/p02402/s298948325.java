

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
         long sum = 0;
        for (int i= 0; i< arr.length; i++){
            sum+= arr[i];
        }
        
       System.out.println(arr[0] + " " + arr[n-1] + " " + sum);
    }
}

