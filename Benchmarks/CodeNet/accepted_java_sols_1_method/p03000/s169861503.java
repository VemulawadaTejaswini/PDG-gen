import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int sum = 0;
		int boundtime = 1;
		int i=0;
		do {
			i++;
			sum+=sc.nextInt();
			if(sum <= X) {
				boundtime++;
			}
		}while(i < N);
		sc.close();
		System.out.println(boundtime);
	}

}
