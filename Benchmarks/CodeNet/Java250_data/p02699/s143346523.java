import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		System.out.print(" ");

		 int S= scanner.nextInt();
		 int W = scanner.nextInt();
		 
		 
		 
		 if(W>=S) {
			 System.out.println("unsafe"); 
		 }
		 else {
			 System.out.println("safe"); 
		 }

		scanner.close();
     
	}
}
