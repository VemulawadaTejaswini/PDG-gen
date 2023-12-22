import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		boolean notPrime = false;
		int ans = 0;
		for(int i = min; i < 1000000; i++){
			notPrime = false;
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					notPrime = true;
					break;
				}
			}
			if(!notPrime){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
