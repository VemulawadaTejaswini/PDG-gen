import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] dpA = new int[N+1];
        int[] dpB = new int[N+1];
        int[] dpC = new int[N+1];
        for (int i = 1; i <= N; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	
        	dpA[i] = a + Math.max(dpB[i-1], dpC[i-1]);
        	dpB[i] = b + Math.max(dpA[i-1], dpC[i-1]);
        	dpC[i] = c + Math.max(dpA[i-1], dpB[i-1]);
        }
        
        System.out.println(Math.max(dpA[N], Math.max(dpB[N], dpC[N])));
    }
}

