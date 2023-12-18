import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//n個の偶数
		int m=sc.nextInt();		//m個の奇数
		
		System.out.println(n*(n-1)/2+m*(m-1)/2);
	}

}
