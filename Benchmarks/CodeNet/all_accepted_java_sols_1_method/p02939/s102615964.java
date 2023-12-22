
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int con = 0;
		String pre = "";
		int took = 1;
		int len = string.length();

		while(string.length() > 0) {
			took = 1;
			//着目箇所評価
			if (pre.length() == 2) {
				took = 1;
				pre = string.substring(0,1);
			}else {
				if (string.substring(0,1).equals(pre) == false) {
					took = 1;
					pre = string.substring(0,1);
				}else {
					if (string.length() == 1) {
						break;
					}
					took = 2;
					pre = string.substring(0,2);
				}
			}
			con++;
			string = string.substring(took,string.length());
		}

		System.out.println(con);

	}
}
