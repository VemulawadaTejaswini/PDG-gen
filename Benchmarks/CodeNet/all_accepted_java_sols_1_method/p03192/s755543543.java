import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String N  = sc.next();
		
		String[] Array =  N.split("");
		int k = 0;
		for (String string : Array) {
			if(string.equals("2")) {
			++k;
			}
		}
		
		System.out.println(k);
		
	}

}
