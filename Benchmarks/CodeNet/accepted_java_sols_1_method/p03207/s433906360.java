import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int sum = 0;
		int max = 0;
		
		for(int p = 1 ,i = 0; p <= N ; sum += i,p++) {
		i = stdIn.nextInt();
			if (max < i) 
				max = i;
		}
		 
		int X = sum - (max / 2);
		System.out.println(X);
		
	}

	}


