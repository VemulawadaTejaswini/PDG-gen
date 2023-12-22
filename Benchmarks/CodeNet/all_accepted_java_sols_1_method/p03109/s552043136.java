
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		str = str.replaceAll("^2019/", "");
		str = str.replaceAll("/.*$", "");
		if(Integer.parseInt(str) > 4) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}

}
