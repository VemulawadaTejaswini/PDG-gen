import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] cell = new int[N];
		int max = 0;
		String ans = "Yes";
		
		for(int i = 1; i <= N; i++) {
			cell[i-1] = sc.nextInt();
		}
		
		for(int j = 1; j <= N; j++) {
			if(max <= cell[j-1]) {
				max = cell[j-1];
			} else {
				if(max -1 > cell[j-1]) {
					
					ans = "No";
				}
			}
		}
		
		System.out.println(ans);
	}

}
