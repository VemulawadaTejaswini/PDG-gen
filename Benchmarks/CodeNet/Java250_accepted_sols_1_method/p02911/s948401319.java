import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] man = new int[N];
        for (int i = 0; i < Q; i++) {
        	man[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < N; i++) {
        	if (man[i] <= Q - K) {
        		System.out.println("No");
        	} else {
        		System.out.println("Yes");
        	}
        }
    }
}