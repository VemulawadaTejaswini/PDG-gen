import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a <= b*2) {
		System.out.println(0);
	} else {
		System.out.println(a-b*2);
	}
	}
}
