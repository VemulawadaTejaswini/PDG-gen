import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] set = new int[1000];
        
        while(true){
            int sum = 0;
            int n = sc.nextInt();
            if(n==0) break;
            for (int i=0;i<n;i++) {
                set[i] = sc.nextInt();
                sum += set[i];
            }
            double ave = sum / n;
            double sigma2 = 0;
            for (int i=0;i<n;i++) {
                sigma2 += (set[i]-ave)*(set[i]-ave)/n;
            }
            System.out.println(Math.sqrt(sigma2));
        }
    }
}