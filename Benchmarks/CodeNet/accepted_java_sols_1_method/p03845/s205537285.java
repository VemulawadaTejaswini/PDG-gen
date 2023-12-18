import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int index = scan.nextInt() - 1;
            int time = scan.nextInt();
            
            System.out.println(sum + time - arr[index]);
        }
    }
}
