import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int D = sc.nextInt();
    	List<int[]> order = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
    		int[] map = new int[D];
    		for (int j = 0; j < D; j++) {
    			map[j] = sc.nextInt();
    		}
    		order.add(map);
    	}
    	int count = 0;
    	for (int i = 0; i < N-1; i++) {
    		for (int j = i+1; j < N; j++) {
    			int[] f = order.get(i);
    			int[] b = order.get(j);
    			double total = 0.0;
    			for (int k = 0; k < D; k++) {
    				total += Math.pow((f[k] - b[k]), 2);
    			}
    			double root = Math.sqrt(total);
    			double ceil = Math.ceil(root);
    			if (root == ceil) {
    				count++;
    			}
     		}
    	}
    	System.out.println(count);
    }
}