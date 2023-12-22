import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for(int i = 0; i < N-1; i++){
            if(h[i] > h[i+1]){
                count += h[i] - h[i+1];
            }
        }
        count += h[N-1];
        System.out.println(count);
    }
}
