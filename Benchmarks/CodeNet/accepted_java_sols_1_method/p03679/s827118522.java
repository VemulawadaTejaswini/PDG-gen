import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(b<c) {
			if(c-b<=a) {
				System.out.println("safe");
			}
			else {
				System.out.println("dangerous");
			}
		}
		else {
			System.out.println("delicious");
		}
	}
}