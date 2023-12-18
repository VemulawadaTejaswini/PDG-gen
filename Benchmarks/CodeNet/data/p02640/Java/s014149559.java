import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int flag = 0;
		for(int i=0; i<=x; i++) {
			if(y==2*i + 4*(x-i)) {
				flag = 1;
				break;
			}
		}
			if(flag==1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	}

}
