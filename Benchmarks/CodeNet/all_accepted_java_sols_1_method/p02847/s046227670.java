import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		String[] str = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

		for(int i = 0;i<str.length;i++) {

			if(str[i].equals(S)) {

				if(i == 6) {
					System.out.println(7);
				}else {
					System.out.println(7-(i+1));
				}
			}

		}


	}

}
