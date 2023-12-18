import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		boolean bl = false;
		for(int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			if(x[i] == 0) {
				System.out.println(i + 1);
				bl = true;
			}
		}
		if(!bl)
			System.out.println("0");
	}
}
