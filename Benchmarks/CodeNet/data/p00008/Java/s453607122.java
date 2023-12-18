import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		while(sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println(combinationOf4Integers(n));
		}
		sc.close();
	}

	static int sumOf4Integers(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	static int combinationOf4Integers(int n) {
		int result = 0;
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k <= 9; k++) {
					for(int l = 0; l <= 9; l++) {
						if(sumOf4Integers(i, j, k, l) == n) result++;
					}
				}
			}
		}
		return result;
	}
}