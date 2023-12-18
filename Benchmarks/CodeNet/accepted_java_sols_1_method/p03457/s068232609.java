import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int [n+1];
		int []y = new int [n+1];
		int []t = new int [n+1];
		
		x[0] = 0; y[0] = 0; t[0] = 0;
		int exist = 0;
		
		for (int i = 1; i <= n; i++) {
			t[i] =sc.nextInt();
			x[i] =sc.nextInt();
			y[i] =sc.nextInt();
			
			int X = Math.abs(x[i] - x[i - 1]);
			int Y = Math.abs(y[i] - y[i - 1]);
			int T = t[i] - t[i -1];
			
			if(T < X + Y || (X + Y)%2 != T%2) 
				 break;
			exist += 1;
		}
		if(exist == n)
			System.out.print("Yes");
		else
			System.out.println("No");
	    }
	}


