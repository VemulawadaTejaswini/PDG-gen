import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] L = new int[N];
        int max = 0;
        int sum = 0;
        for(int i=0; i<N; i++) {
            L[i] = Integer.parseInt(sc.next());
            if(max < L[i]) {
                max = L[i];
            }
            sum += L[i];
        }
        if(sum - max > max) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}