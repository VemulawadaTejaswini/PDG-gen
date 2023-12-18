import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        
        
        int maxp = values[1]-values[0];
        		int minv = Math.min(values[1], values[0]);
        		for(int i = 2; i < n; i ++) {
        			maxp = Math.max(maxp, values[i] - minv);
        			minv = Math.min(minv, values[i]);
        		}
        
        
		System.out.println(maxp);
	}
}
