import java.util.Scanner;
public class Main{
	
	public static void main (String[] args) {
		
		Main main = new Main();
		main.solve();
	}
	
	private void solve() {
		
		Scanner scanner = new Scanner (System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int C = scanner.nextInt();
		
		int[] list = new int [M];
		
		for (int index=0; index<M; index++) {
			list[index]=scanner.nextInt();
		}
		
		int count = 0;
		
		for (int index=0; index<N; index++) {
			int sum = 0;
			for (int index2=0; index2<M; index2++) {
				int number = scanner.nextInt();
				sum+=(number*list[index2]);
			}
			
			sum+=C;
			
			if (sum>0) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}