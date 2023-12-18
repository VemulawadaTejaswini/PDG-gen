import java.util.Scanner;

public class Main {
	
	public static String properties(int[] ls, int n) {
		
		if(n == 1) {
			if(ls.length == 1) {
				return null;
			}
			else if(ls.length == 2) {
				return ", left key = " + ls[1];
			}
			else {
				return ", left key = " + ls[1] + ", right key = " + ls[2];
			}
		}
		else {
			
			if(ls.length > n*2) {
				return ", parent key = " + ls[(int) Math.floor(n/2)-1] + ", left key = " + ls[n*2-1] + ", right key = " + ls[n*2];
			}
			else if(ls.length == n*2) {
				return ", parent key = " + ls[(int) Math.floor(n/2)-1] + ", left key = " + ls[n*2-1];
			}
			else {
				return ", parent key = " + ls[(int) Math.floor(n/2)-1];
			}
			
		}
	}

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] ls = new int[length];
		for(int i = 0; i < length; i++) {
			ls[i] = in.nextInt();
		}
		
		for(int j = 1; j <= length; j++) {
			System.out.println("node " + j + ": key = " + ls[j-1] + properties(ls, j) + ", ");
		}
		
		in.close();
		
	}
}
