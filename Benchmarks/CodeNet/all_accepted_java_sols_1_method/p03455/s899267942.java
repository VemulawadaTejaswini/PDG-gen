import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//整数の入力
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a*b;
		
		String Even;
		String Odd;
				
		if(c%2==0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
	}

}
