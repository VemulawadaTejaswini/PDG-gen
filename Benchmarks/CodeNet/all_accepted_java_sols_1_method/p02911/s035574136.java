import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = 0;
        }
        for(int i = 0;i<q;i++){
            int point = sc.nextInt() - 1;
            a[point]++;
        }
        for(int i = 0;i<n;i++){
            if(0<(k-(q-a[i]))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        System.out.println();
        sc.close();
    }
}