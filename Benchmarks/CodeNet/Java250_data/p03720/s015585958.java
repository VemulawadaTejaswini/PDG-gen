import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        while(m-- > 0){
            arr[scan.nextInt() - 1]++;
            arr[scan.nextInt() - 1]++;
        }
        for(int i : arr) System.out.println(i);
        
    }
}
