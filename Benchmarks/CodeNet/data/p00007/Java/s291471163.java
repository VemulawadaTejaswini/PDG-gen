import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans = 100000;
		int temp;
		
		for(int i = 0; i < n; i++){
			ans *= 1.05;
			temp = ans / 1000 * 1000;
			if(ans != temp)ans = temp + 1000;
		}
		System.out.println(ans);
	}
}