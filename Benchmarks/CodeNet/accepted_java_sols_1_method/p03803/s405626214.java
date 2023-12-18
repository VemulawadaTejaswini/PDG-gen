import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==1) a+=13;
		if(b==1) b+=13;
		if(a==b) {
			System.out.println("Draw");
		}else if(a>b) {
			System.out.println("Alice");
		}else {
			System.out.println("Bob");
		}
	}
}
