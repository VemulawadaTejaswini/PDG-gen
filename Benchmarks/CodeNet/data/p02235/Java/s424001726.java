
import java.util.Scanner;

public class Main{
	
	public static int findLCS(String s0, String s1) {
		int[][] arr = new int[s1.length()+1][s0.length()+1]; 
		for(int i = 1; i <= s1.length(); i++) {
			for(int j = 1; j <= s0.length(); j++) {
				if(s0.charAt(j-1) != s1.charAt(i-1))
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				else
					arr[i][j] = 1 + arr[i-1][j-1]; 
			}
		}
		return arr[s1.length()][s0.length()]; 
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int q = in.nextInt(); 
		
		for(int i = 0; i < q; i++) {
			System.out.println(findLCS(in.next(), in.next())); 
		}
	}

	

}
