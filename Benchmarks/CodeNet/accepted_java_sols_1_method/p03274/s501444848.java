import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        int min = Integer.MAX_VALUE;
        x[0] = 0;
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
 
        for (int i=k-1;i<n;i++){
            int abs = Math.abs(x[i]-x[i-k+1]);
            min = Math.min(min,Math.min(Math.abs(x[i])+ abs,Math.abs(x[i-k+1])+ abs));
        }
        System.out.println(min);
    }
}