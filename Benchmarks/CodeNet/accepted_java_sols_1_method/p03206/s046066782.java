import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a==25) {
			System.out.println("Christmas");
		}
		if(a==24) {
			System.out.println("Christmas Eve");
		}
		if(a==23) {
			System.out.println("Christmas Eve Eve");
		}
		if(a==22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}