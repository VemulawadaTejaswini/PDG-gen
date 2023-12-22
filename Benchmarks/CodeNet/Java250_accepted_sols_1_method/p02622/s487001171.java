
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		String[] Sarray = S.split("");
		String[] Tarray = T.split("");

		int count = 0;
		for(int i=0; i<S.length(); i++) {
			if(!(Sarray[i].equals(Tarray[i]))) {
				count = count + 1;
			}

		}
		System.out.println(count);

	}

}