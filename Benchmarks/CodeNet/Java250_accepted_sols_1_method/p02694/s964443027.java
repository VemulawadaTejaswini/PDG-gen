import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Long X = sc.nextLong();

		int i = 0;
		int flag = 0;
		Long K = (long) 100;

		while(flag == 0) {
			if(K >= X) {
				flag = 1;
				i = i - 1;
			}
			K = (long)(1.01*K);
			i++;
		}

		System.out.println(i);
	}

}