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
        
        Arrays.sort(a);
        
        if(a[n/2-1] != a[n/2]){
            res = a[n/2]-a[n/2-1];
        }
        
        System.out.println(res);
    }
}
