import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int n = sc.nextInt();
				if(n==0) break;
				double sum = 0;
				int[] scores = new int[n];
				for(int i=0;i<n;i++) {
					scores[i] = sc.nextInt();
					sum += scores[i];
				}
				double avg = sum / n;
				sum = 0;
				for(int i=0;i<n;i++) {
					sum += Math.pow(scores[i]-avg,2);
				}
				System.out.println(Math.sqrt(sum/n));
			}
		}
	}
}
