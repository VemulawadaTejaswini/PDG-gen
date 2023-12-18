import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int sum = 0;
		String s = sc.nextLine();
		for(int i = 0; i <= len - 2; i++) {
			//System.out.println(i);
			//System.out.println(s.substring(i, i + 1));
			//System.out.println(s.substring(i + 1, i + 2));
			if(s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
				sum += 1;
			}
		}
		System.out.println(len - sum);

	}

}