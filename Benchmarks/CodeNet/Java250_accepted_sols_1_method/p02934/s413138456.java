import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double b = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            b += 1 / a[i];
        }
        System.out.println((double)1 / b);
    }
}