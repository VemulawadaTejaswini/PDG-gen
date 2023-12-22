import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int[] h = new int[n];
		    int cnt = 0;
		    int ans = 0;
		    for(int i=0;i<n;i++) {
		    	h[i] = sc.nextInt();
		    	if(i>=1) {
		    		if(h[i-1]-h[i]>=0) {
		    			cnt +=1;
		    			if(ans<cnt) {
		    				ans = cnt;
		    			}
		    		}else {
		    			cnt = 0;
		    		}
		    	}
		    }
		    System.out.println(ans);

		    sc.close();
	}
}
