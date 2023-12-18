import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a2, b2;
		a2 = a + w;
		b2 = b + w;
		if(Math.abs(a-b)> w) {
			if(a>b) {
				System.out.println(a-b2);
			}else if(a<b) {
				System.out.println(b-a2);
			}
		}else {
			System.out.println("0");
		}
	}
}