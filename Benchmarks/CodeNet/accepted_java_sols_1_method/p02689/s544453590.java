import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		int[] h = new int[n];
    		int[] mi = new int[n];
    		for (int i = 0; i < n; i++) {
    			h[i] = sc.nextInt();
    			
    		}
    		int cnt = 0;
    		for (int i = 0; i < m; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			mi[a - 1] = Math.max(mi[a - 1], h[b - 1]);
    			mi[b - 1] = Math.max(mi[b - 1], h[a - 1]);
    		}
    		for (int i = 0; i < n; i++) {
    			if (h[i] > mi[i]) {
    				cnt++;
    			}
    		}
    		
    		System.out.println(cnt);
    	}
     
    }