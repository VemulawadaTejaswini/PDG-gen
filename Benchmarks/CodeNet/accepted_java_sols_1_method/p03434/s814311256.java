import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        
        Arrays.sort(arr);
        
        int alice = 0;
        int bob = 0;
        for(int i = n-1; i >= 0; i -= 2) alice += arr[i];
        for(int i = n-2; i >= 0; i -= 2) bob += arr[i];
        
        System.out.println(alice - bob);
        
    }
}
