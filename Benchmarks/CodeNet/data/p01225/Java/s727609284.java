import java.util.Scanner;

public class Main{
	public static boolean judge(int[] x){
		for(int i = 0; i < x.length; i++){
			if( x[i] == 0 ){
				continue;
			} else if( x[i] >= 3 ){
				x[i] -= 3;
				i--;
			} else if( i+2 < x.length && x[i] > 0 && x[i+1] > 0 && x[i+2] > 0 ){
				x[i]--; x[i+1]--; x[i+2]--;
				i--;
			} else {
				return false;
			}
		}
		return true;
	}
				
	public static int solve(int[] num, String[] color){
		int[] R = new int[9];
		int[] G = new int[9];
		int[] B = new int[9];
				
		for(int i = 0; i < 9; i++){
			if( color[i].equals("R") ){
				R[num[i]]++;
			} else if( color[i].equals("G") ){
				G[num[i]]++;
			} else {
				B[num[i]]++;
			}
		}
		
		if( judge(R) && judge(G) && judge(B) ){
			return 1;
		} else {
			return 0;
		}
	}
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] result = new int[n];
		for(int i = 0; i < n; i++){
			int[] num = new int[9];
			String[] color = new String[9];
			for(int j = 0; j < 9; j++){
				num[j] = stdIn.nextInt();
			}
			for(int j = 0; j < 9; j++){
				color[j] = stdIn.next();
			}
			result[i] = solve(num, color);
		}
		for(int i = 0; i < n; i++){
			System.out.println(result[i]);
		}
	}
}