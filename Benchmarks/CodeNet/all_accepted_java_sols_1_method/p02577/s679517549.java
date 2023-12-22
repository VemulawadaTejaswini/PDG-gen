import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		
		String n = sc.next();
		String chkNumStr = "";
		int chkNum=0;
		
		
		
		while(n.length() != 0) {
			chkNumStr = n.substring(0, 1);
			chkNum = chkNum + Integer.parseInt(chkNumStr);
			n = n.substring(1, n.length());
		}
		if(chkNum%9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}