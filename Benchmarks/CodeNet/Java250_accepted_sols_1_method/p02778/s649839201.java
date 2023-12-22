import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();//空白文字までの入力を取得
		String str2 = "";
		for(int i = 0;i < str.length();i++) {
			str2 = str2 + "x";
		}
		
		System.out.println(str2);
		scan.close();
	}

}
