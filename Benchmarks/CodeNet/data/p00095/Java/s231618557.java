import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Fisher implements Comparable<Fisher>{
		int number, fished;

		public Fisher(int number, int fished) {
			super();
			this.number = number;
			this.fished = fished;
		}

		@Override
		public int compareTo(Fisher arg0) {
			return arg0.fished - this.fished == 0 ? this.number - arg0.number : arg0.fished - this.fished;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		Fisher[] fish = new Fisher[n];
		
		for(int i = 0; i < n; i++){
			final int a = sc.nextInt();
			final int v = sc.nextInt();
			
			fish[i] = new Fisher(a, v);
		}
		
		Arrays.sort(fish);
		
		System.out.println(fish[0].number + " " + fish[0].fished);

	}

}