import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[4];
		
		for(int i=0; i<4; i++) {
			x[i] = sc.nextInt();
		}
		int a = x[2] - x[0];
		int b = x[3] - x[1];
		
		System.out.println(x[2] - b);
		System.out.println(x[3] + a);
		System.out.println(x[0] - b);
		System.out.println(x[1] + a);

	}

}
