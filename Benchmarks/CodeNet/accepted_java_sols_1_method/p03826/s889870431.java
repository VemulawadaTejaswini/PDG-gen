import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        long [] arr = new long[4];
        long max =0;
        for (int i=0;i<4;i++)
        arr[i] = (long)scanner.nextInt();
        
        
      max = Math.max(arr[0]*arr[1], arr[2]*arr[3]);
        
    System.out.println(max);
        
     }
}

