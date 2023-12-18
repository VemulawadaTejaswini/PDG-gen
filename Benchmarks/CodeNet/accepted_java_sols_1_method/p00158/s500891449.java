import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		int ans;
		
		while(true){
			n = scan.nextInt();
			if(n== 0)break;
			
			ans = 0;
			
			while(n != 1){
				if(n % 2 == 0)n /= 2;
				else n = n * 3 + 1;
				ans++;
			}
			System.out.println(ans);
		}
	}
}