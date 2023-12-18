//ABC168 B
//未解決

package atcoder;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int K;
		String S;

		//System.out.println("整数を入力");
		K=sc.nextInt();  //整数
		sc.skip("＼＼s");
		//System.out.println("文字列を入力");
		S=sc.nextLine();  //文字列

		//System.out.println(K);  //整数
		//System.out.println(S);  //文字列


		if(S.length()<=K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0,K)+"...");
		}

		sc.close();



	}
}
