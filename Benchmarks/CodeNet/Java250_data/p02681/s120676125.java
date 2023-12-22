
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if(B.substring(0,A.length()). equals (A)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
