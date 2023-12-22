import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        for(int i = 0; i < T; i++)
            a[i] = sc.nextInt();
        sc.close();

        Arrays.sort(a);
        int max = a[T-1];
        if(max <= K-max+1){
            System.out.println(0);
        } else {
            System.out.println(2*max - K - 1);
        }
    }
}