import java.io.*;
import java.util.*;

public class Main
{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int num[] = new int[10001];
        int sum = 0;
        
        for (int i = 0; i < N; i++){
            int temp = sc.nextInt();
            num[temp] = num[temp] + 1;
        }        
        
        int q=sc.nextInt();
        
        for (int i = 0; i < q; i++){
            int temp = sc.nextInt();
            sum = sum + num[temp];
        }
     
        System.out.println(sum);
    }
}