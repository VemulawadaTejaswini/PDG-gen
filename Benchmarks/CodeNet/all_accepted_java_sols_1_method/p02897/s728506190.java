import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count_odd=0;
		
		for(int i=1;i<=N;i++) {
			if(i%2==1) {
				count_odd++;
			}
		}
		
		double ans = (double)count_odd/N;
		
		System.out.println(ans);
		
	}

}