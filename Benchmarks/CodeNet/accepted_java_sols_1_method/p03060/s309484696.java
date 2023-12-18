import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] v = new int[N];
        int[] c = new int[N];
        for(int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(sc.next());
        }
        int count = 0;
        for(int i = 0; i < N; i++) {
            if(c[i] < v[i]) {
                count += v[i] - c[i];
            }
        }
        System.out.println(count);
        
    }
}