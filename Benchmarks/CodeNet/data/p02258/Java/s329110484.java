import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	public void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();

		int max = Integer.MIN_VALUE;
		int min = scan.nextInt();
		
		for(int i = 1;i < n;i++) {
			int R = scan.nextInt();
			
			max = Math.max(max, R - min);
			
			min = Math.min(min, R);
		}

		System.out.println(max);
	}
}
