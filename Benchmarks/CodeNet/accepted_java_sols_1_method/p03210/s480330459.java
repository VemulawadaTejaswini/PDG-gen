import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = Integer.parseInt(str);
		if(i == 3) {
			System.out.println("YES");
		}else if(i==5){
			System.out.println("YES");
		}else if(i ==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
