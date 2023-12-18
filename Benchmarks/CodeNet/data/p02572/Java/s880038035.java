import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());
       String[] arr1 = br.readLine().split(" ");

        int[] arr = new int[arr1.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(arr1[i]);
        }

        int sum = 0;

        int MOD = (int) 1e9 + 7;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
               int product = (arr[i] % MOD) *( arr[j] % MOD) ;
                sum = (sum + product ) % MOD;
            }
        }
        System.out.print(sum);
    }
}