import java.util.Scanner;	
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			if(n + k == 0) break;
			
			int[] ary = new int[k];
			for(int r = 0; r < k; r++) {
				ary[r] = stdIn.nextInt();
			}
			boolean flag = true;
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < k; c++) {
					int blood = stdIn.nextInt();
					ary[c] -= blood;
					if(ary[c] < 0) flag = false;
				}
			}
			
			if(flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}