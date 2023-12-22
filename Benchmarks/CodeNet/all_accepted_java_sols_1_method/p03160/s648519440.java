import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] stones = new int[n];
		int[] sol = new int[n];
		for (int i = 0; i < n; i++) {
			stones[i]=s.nextInt();
		}
		sol[0]=0;
		sol[1]=Math.abs(stones[0]-stones[1]);
		for (int i = 2; i < sol.length; i++) {
			if((Math.abs(stones[i-1]-stones[i])+sol[i-1])< (Math.abs(stones[i-2]-stones[i])+sol[i-2])) {
				sol[i]=Math.abs(stones[i-1]-stones[i])+sol[i-1];
			}else {
				sol[i]=Math.abs(stones[i-2]-stones[i])+sol[i-2];
			}
			
		}
		System.out.println(sol[n-1]);
	}

}
