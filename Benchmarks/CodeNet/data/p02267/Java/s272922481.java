import java.io.*;
import java.util.*;

public class Main
{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        long num[] = new long[10001];
        long sum = 0;
        
        for (long i = 0; i < N; i++){
            int temp = sc.nextInt();
            num[temp] = num[temp] + 1;
        }        
        
        int q=sc.nextInt();
        
        for (long i = 0; i < q; i++){
            int temp = sc.nextInt();
            sum = sum + num[temp];
        }
     
        System.out.println(sum);
    }
}