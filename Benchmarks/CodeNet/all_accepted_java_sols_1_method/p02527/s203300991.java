import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] m = new int[n];
		for (int i = 0; i < n; i++){
			m[i] = input.nextInt();
		}
		
		Arrays.sort(m);
		
		for (int i = 0; i < n; i++){
			System.out.print(m[i]);
			if (i == n - 1) System.out.println();
			else System.out.print(" ");
		}
	}
}