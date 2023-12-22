
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String name2 = sc.next();
		String name3 = name2.substring(0,name2.length()-1);

		if(name.equals(name3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			}
		}

}