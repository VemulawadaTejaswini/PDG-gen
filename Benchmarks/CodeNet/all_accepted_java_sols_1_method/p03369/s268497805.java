import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count =0;
		for(int i=0;i<=2;i++) {
			if(s.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println(700+count*100);

	}

}
