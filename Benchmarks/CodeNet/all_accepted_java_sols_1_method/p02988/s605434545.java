import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int res = 0;
        
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 1;i < (n-1);i++){
            if(a[i-1]<a[i] && a[i]<a[i+1]){
                res++;
            }else if(a[i+1]<a[i] && a[i]<a[i-1]){
                res++;
            }
        }
        System.out.println(res);
    }
}
