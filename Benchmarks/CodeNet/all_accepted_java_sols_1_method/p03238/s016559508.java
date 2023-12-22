import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N==2) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			System.out.println(A+B);
		}
		else if(N==1) {
			System.out.println("Hello World");
		}
	}
}
