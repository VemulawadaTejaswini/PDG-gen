import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i = 1;i < 10;i++){
			for(int j = 1;j < 10;j++){
				if(a == i * j){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}
