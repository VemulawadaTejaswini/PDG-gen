import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		xCubic();

	}
	
	public static void xCubic() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n * n * n);
	}
}

