import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sub = 1000;
		
		for(int i=0; i < str.length()-2;i++) {
			int temp = Integer.parseInt(str.substring(i, i+3));
			sub = Math.min(sub, Math.abs(temp-753));
		}
		System.out.println(sub);
		sc.close();
	}

}
