
import java.util.Scanner;

//exhaustive search
public class Main {
	public static boolean solve(int[] data, int t, int rest) {
		
		//termination conditions
		if(rest == 0) {
			return true;
		}
		
		//otherwise, come to last
		if(t == data.length -1) {
			if(data[t] == rest) return true;
			return false;
		}
		
		return solve(data, t+1, rest) || solve(data, t+1, rest-data[t]);
	}
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int [] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = cin.nextInt();
		}
		
		n = cin.nextInt();
		for(int j = 0; j < n; j++) {
			if(solve(A, 0, cin.nextInt())) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		
		cin.close();
		
	}
	
}