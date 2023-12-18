
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int K;
		String S;

		K=sc.nextInt();  //整数

		Scanner sc2=new Scanner(System.in);
		S=sc2.nextLine();  //文字列

		//System.out.println(K);  //整数
		//System.out.println(S);  //文字列


		if(S.length()<=K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0,K)+"...");
		}


	}
}
