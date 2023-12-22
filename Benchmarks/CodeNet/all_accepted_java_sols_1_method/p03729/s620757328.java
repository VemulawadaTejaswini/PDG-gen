import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();

		if(A.substring(A.length()-1).equals(B.substring(0,1)) && B.substring(B.length()-1).equals(C.substring(0,1))){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
