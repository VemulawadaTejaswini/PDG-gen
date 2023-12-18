
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		if(b.equals("A")){
			System.out.println("T");
		} else if (b.equals("C")) {
			System.out.println("G");
		} else if (b.equals("G")) {
			System.out.println("C");
		} else if (b.equals("T")) {
			System.out.println("A");
		}
	}

}
