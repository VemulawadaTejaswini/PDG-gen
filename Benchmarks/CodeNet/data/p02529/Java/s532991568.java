import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) S[i] = input.nextInt();
		
		int q = input.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) T[i] = input.nextInt();
		
		int count = 0;
		
		boolean[] b = new boolean[q];
		for (int i = 0; i < q; i++){
			for (int j = 0; j < n; j++){
				if (S[j] == T[i]){
					b[i] = true;
					break;
				}
			}
		}
		
		for (int i = 0; i < q; i++){
			if (b[i])count++;
		}
		
		System.out.println(count);
	}
}