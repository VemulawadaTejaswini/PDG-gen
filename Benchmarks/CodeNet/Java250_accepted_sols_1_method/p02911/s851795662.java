import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k  = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[q];
        for(int i=0;i<q;i++){
            a[i] = Integer.parseInt(sc.next());
        }    
        int[] point = new int[n];
        for(int i=0;i<q;i++){
            int ans = a[i]-1;
            point[ans]++;
        }
        for(int i=0;i<n;i++){
            if(k - q + point[i]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}