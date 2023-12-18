import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < N; i++)
            b[i] = sc.nextInt();
        sc.close();
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0; i < N; i++){
            if(a[i] > b[i]){
                sum1 += (a[i]-b[i]);
            } else {
                sum2 += (b[i]-a[i])/2;
            }
        }
        if(sum1 <= sum2)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}