import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        double gyaku = 0;
        for(int i = 0;i<n;i++){
            gyaku += 1 / (float)(a[i]);
        }
        gyaku = 1 / gyaku;
        System.out.println(gyaku);
        sc.close();
    }
}