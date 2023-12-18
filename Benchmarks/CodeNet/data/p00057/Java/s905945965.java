import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n;
		int ans;
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			ans = 1;
			for(int i = 1; i < n; i++){
				ans += n;
			}
			System.out.println(ans);
		}
	}
}