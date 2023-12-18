import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N  = 9;
		
		String[] names = new String[N];
		int[] num = new int[N];
		int[] prices = new int[N];
		
		for(int i = 0; i < N; i++){
			names[i] = sc.next();
			int pre = sc.nextInt();
			int post = sc.nextInt();
			
			num[i] = pre + post;
			prices[i] = pre * 200 + post * 300;
		}
		
		for(int i = 0; i < N; i++){
			System.out.println(names[i] + " " + num[i] + " " + prices[i]);
		}

	}

}