import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
			
		int count = n / x;
		int answer = 0;
		
		if(n % x == 0) answer = count;
		else answer = count + 1;
			
		System.out.println(answer * t);
			
		
	
		
		
		
	}

}
