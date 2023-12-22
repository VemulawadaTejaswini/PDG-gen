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
        Arrays.sort(a);

        int k = 0;
        int Alice = 0;
        int Bob = 0;
        while(k < n){
            if(k%2==0){
                Alice += a[n - 1 - k];
            }else{
                Bob += a[n - 1 - k];
            }
            k++;
        }
        System.out.println(Alice - Bob);
        sc.close();
    }
}