import java.util.Scanner;

class Main{
	public static void main(String[] main) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();

		if((a%1000)%111==0) {
			System.out.println("Yes");
		}
		else if((a/10)%111==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}