import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        double sum = 0;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                sum += Math.sqrt(Math.pow(x[i]-x[j],2) + Math.pow(y[i] - y[j],2));
            }
        }
        System.out.println(sum * 2 / N);
    }
}