import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.println("数値を入力してください");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		for (int i=1;i<=3;i++){
			x=x*n;
		}
		System.out.println(n+"の３乗は" + x + "です");
	}

}