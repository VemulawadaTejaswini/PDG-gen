import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] p = new int[N];
        int max = 0;
        int sum = 0;
        for(int i=0; i<N; i++) {
            p[i] = Integer.parseInt(sc.next());
            sum += p[i];
            if(max < p[i]) {
                max = p[i];
            }
        }
        System.out.println(sum-max/2);
    }
}