import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		double B=sc.nextDouble();

		double result=A*(int)B;

		System.out.println(String.format("%.0f",Math.floor(result)));
	}

}