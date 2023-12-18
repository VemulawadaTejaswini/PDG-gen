import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		int k=sc.nextInt();		//英小文字からなる文字列
		String s=sc.next();
		int n=s.length();
		String komos=s.toLowerCase ();	//小文字に

		if(n>=1&&n<=100) {
			if(k>=1&&k<=100) {
				if(n<=k) {
					System.out.println(komos);
				}else {
					System.out.println(komos.substring(0,k)+"...");
				}
			}
		}
		sc.close();
	}
}
