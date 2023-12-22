import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n-1; i++){
          int v = in.nextInt();
          arr[v-1]++;
        }
       
       for(int i =0; i< n; i++)
         System.out.println(arr[i]);


    }
}