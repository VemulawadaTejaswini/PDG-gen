import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();


		int nedan=700;
		String[] strArray = s.split("");

		for(int i=0;i<3;i++) {
			if(strArray[i].equals("o"))
				nedan+=100;
		}

		System.out.print(nedan);

	}

}
