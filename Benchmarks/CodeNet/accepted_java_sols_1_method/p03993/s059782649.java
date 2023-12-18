import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int[] fr = new int[n];
		int friends = 0;
		
		for (int i = 0; i < n; i ++) {
			fr[i] = cin.nextInt();
		}
		
		for (int i = 0; i < n; i ++) {
			int j = fr[i]-1;
//			System.out.println(j);
//			System.out.println(i+1);
			if (fr[j] == (i+1)) {
				friends++;
			}
		}
		
		System.out.println(friends/2);
	}

}
