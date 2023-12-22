import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner= new Scanner(System.in);
		int a, b ,n;
		
		n = scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int taxi = b;
		int train = n * a;
		int answer;
		
		if(taxi < train) {
			answer = taxi;
		}else {
			answer = train;
		}
		
		System.out.println(answer);
		
	}

}
