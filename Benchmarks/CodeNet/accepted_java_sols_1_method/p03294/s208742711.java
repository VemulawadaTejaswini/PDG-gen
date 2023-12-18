import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++){
        	a[n]=sc.nextInt();
        }
        
        //let m = a[1]*a[2]*...*a[n-1]-1
        //m%a[n] = a[n]-1
        int ans = 0;
        for(int n=0;n<N;n++){
        	ans += (a[n]-1);
        }
        System.out.println(ans);
    }
}