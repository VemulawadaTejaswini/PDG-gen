import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String tmp = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i + 1).equals("0")) {
				tmp += "0";
			} else if(str.substring(i, i + 1).equals("1")) {
				tmp += "1";
			} else if(str.substring(i, i + 1).equals("B")) {
				if(tmp.length() == 0) {
					
				} else {
					tmp = tmp.substring(0, tmp.length() - 1);
				}
			}
		}
		
		System.out.println(tmp);
		
		scan.close();
	}

}
