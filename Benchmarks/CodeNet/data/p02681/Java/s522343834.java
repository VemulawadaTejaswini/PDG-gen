import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		boolean ok = true;

		if(!(s.equals(t))) {
			ok = false;
		}
		if(ok){
			if(t.length()-s.length() == 1) {
				System.out.println("Yes");
			}
		}else {
			System.out.println("No");
		}
	}

}
