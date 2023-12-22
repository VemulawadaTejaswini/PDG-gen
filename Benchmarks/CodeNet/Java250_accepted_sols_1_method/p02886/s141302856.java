import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        long ans = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                ans = ans+a[i]*a[j];
            }
        }
        System.out.println(ans);
    }
}