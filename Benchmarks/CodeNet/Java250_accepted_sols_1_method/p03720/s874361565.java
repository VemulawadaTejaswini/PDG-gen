import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int  [] a = new int[M];
        int [] b = new int [M];
        int [] count = new int[N];
        
        for(int i =0; i<M; i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        
        for(int i =0; i<N; i++){
            count[i] = 0;
        }
        
        for(int i=0; i<M; i++){
            count[a[i]-1] += 1;
            count[b[i]-1] += 1;
        }
        
        for(int i=0; i<N; i++){
            System.out.println(count[i]);
        }
        
    }
}
