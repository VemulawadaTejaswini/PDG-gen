import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		long num;
		String str;
		char[] ch;
		int ans; 
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			ans = 0;
			num = n;
			
			while(num >= 5){
				ans += num / 5;
				num /= 5;
			}
			
			System.out.println(ans);
		}
	}
}