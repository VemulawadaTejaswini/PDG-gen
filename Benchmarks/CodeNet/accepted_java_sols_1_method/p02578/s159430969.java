import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int preA = Integer.parseInt(scan.next());
		int postA = 0;
		long sum=0;
		for(int i=1;i<N;i++) {
			postA = Integer.parseInt(scan.next());
			if(preA > postA) {
				sum += preA - postA;
			} else {
				preA = postA;
			}
			
		}
		System.out.print(sum);
	}
	
}