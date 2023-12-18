import java.util.Scanner;

public class Main {
	private static int MAX_MOD = 10001;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int h = 1;
		
		int b;
		int c;
		
		b = N<=0 ? N : 1;
		c = N<=0 ? 1 : N;
		
		int ans = 0;
		for(int i = b;i<=c;i++){
			ans+=i;
			
			
		}
		
		System.out.println(ans);
		
		
		
	}

}

