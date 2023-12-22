import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String ARC="ARC";
		String ABC="ABC";
		
		if(S.equals(ARC)) {
			System.out.println(ABC);
		}else if(S.equals(ABC)){
			System.out.println(ARC);
		}
	}

}
