import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int[] num = new int[1000];
        
        while ((n = sc.nextInt())!=0){
            int sum = 0;
            for(int i=0;i<n;i++){
                num[i] = sc.nextInt();
                sum += num[i];
            }
            double ave = sum / n;
            double sigma = 0;
            for (int i=0;i<n;i++){
                sigma += Math.pow(num[i] - ave,2)/n;
            }
            System.out.printf("%.8f\n",Math.sqrt(sigma));
        }
        
    }
}