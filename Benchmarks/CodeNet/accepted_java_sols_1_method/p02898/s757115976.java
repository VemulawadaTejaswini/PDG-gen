import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(h);
        int a = N;
        for(int i = 0; i < N; i++){
            if(h[i] >= K){
                a = i;
                break;
            }
        }
        System.out.println(N-a);
    }
}