import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n;
		int ans;
		
		while(scan.hasNextInt()){
			n = scan.nextInt();
			
			ans = 1;
			for(int i = 1; i <= n; i++){
				ans += i;
			}
			System.out.println(ans);
		}
	}
}