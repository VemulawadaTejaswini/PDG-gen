import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int[] arr = new int[N];
            int sum =0;
            for(int i=0 ; i<N ; i++){
                arr[i] = in.nextInt();
                sum =sum +arr[i]-1;
            }
            
           System.out.println(sum);
        
    }
}