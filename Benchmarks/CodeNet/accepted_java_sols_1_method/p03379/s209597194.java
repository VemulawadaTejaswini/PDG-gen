import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] x = new long[N];
        long[] y = new long[N];
        for(int i=0; i<N; i++) {
            x[i] = Long.parseLong(sc.next());
            y[i] = x[i];
        }
        Arrays.sort(y);
        
        if(y[N/2] == y[(N/2)-1]) {
            for(int i=0; i<N; i++) {
                System.out.println(y[N/2]);
            }
        }else {
            for(int i=0; i<N; i++) {
                if(x[i] < y[N/2]) {
                    System.out.println(y[N/2]);
                }else if(x[i] >= y[N/2]) {
                    System.out.println(y[(N/2)-1]);
                }
            }
        }
    }  
}