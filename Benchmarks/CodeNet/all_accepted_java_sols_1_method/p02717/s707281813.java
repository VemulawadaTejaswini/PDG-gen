import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int change;
		
		change=A;
		A=B;
		B=change;
		
		change=A;
		A=C;
		C=change;
		
		System.out.println(A+" "+B+" "+C);
		

	}

}
