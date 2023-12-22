import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		String s=sc.next();		//sは3文字からなる文字列
		
		int n=s.length();		//文字の長さを取得
		
		if(s.substring(0,(n-1)/2).equals(s.substring((n+1)/2,n))) {
		System.out.println("Yes");
		}else {
		System.out.println("No");
		}
		sc.close();
	}

}
