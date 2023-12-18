import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int[N];
        int Y[] = new int[N];
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            X[i] = x;
            Y[i] = x;
        }
        Arrays.sort(Y);
        int mid1 = Y[N/2];
        int mid2 = Y[N/2-1];
        
        for(int i = 0; i < N; i++) {
            if( X[i] < mid1 ) {
                System.out.println(mid1);
            } else {
                System.out.println(mid2);
            }
        }
        
    }
}
