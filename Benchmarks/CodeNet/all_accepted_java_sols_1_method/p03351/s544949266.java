import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x,y,z;
		
		if (a<b){
			x = b-a;
		}
		else {
			x = a-b;
		}
		
		if (b<c){
			y = c-b;
		}
		else {
			y = b-c;
		}
		
		if (a<c){
			z = c-a;
		}
		else {
			z = a-c;
		}
		
		if (z <= d){
//			System.out.println("1");
			System.out.println("Yes");
			return;
		}
		
		if ((x<=d) && (y<=d)){
//			System.out.println("2");
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
		
	}

}
