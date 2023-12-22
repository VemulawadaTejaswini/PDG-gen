    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		int M = sc.nextInt();
     
    		int L = 0;
    		int R = N;
     
    		for (int i=0; i<M; i++) {
    			int L2 = sc.nextInt();
    			int R2 = sc.nextInt();
     
    			L = Math.max(L, L2);
    			R = Math.min(R, R2);
    		}
     
    		int ans = R-L+1;
    		if (ans>0) System.out.println(ans);
    		else System.out.println(0);
    	}
    }