import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();b=sc.nextInt();
		a+=b;
		int cnt=0;
		for(;a>0;a/=10,cnt++);
			System.out.println(cnt);
		
		
		
	}

}