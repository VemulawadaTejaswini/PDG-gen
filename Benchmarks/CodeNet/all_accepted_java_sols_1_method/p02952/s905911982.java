import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int count = 0;
		
		for(int i =1;i<=N;i++) {
			String.valueOf(i);
			if(String.valueOf(i).length()%2==1) {
				count++;
			}
		}
      System.out.println(count);
	}
}