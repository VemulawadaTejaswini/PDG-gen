import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			Scanner sc=new Scanner(System.in);

			int a=sc.nextInt();
			int b=sc.nextInt();

			int num=a*b;

			if(num%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}

			sc.close();
	}

}