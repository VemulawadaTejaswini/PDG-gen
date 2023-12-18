import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] =  sc.nextInt();
        sc.close();
        
        long count = 0;

        for(int i = 0; i < N-1; i++){
            int sum = a[i] + a[i+1];
            if(sum > x){
                count += sum-x;
                a[i+1] = Math.max(0, a[i+1]-(sum-x)); 
            }
        }

        System.out.println(count);
    }
}