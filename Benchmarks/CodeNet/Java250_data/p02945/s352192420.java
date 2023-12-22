import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int g=x+y;
		if(g<x*y)
			g=x*y;
		if(g<x-y) {
			g=x-y;
		}
		System.out.println(g);
	}

}