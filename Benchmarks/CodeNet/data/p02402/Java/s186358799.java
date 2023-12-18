import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long sum = 0;
			int min = 1000000;
			int max = 0;
			
			for(int i = 0; i < N; i++) {
				int number = sc.nextInt();
					if(min > number) {
						min = number;
					}
					if(max < number) {
						max = number;
					}
				sum += number;
			}

			System.out.printf("%d ",min);
			System.out.printf("%d ",max);
			System.out.printf("%d\n",sum);
	}

}

