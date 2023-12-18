import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		int ac = Math.abs(a-c);
		int ab = Math.abs(a-b);
		int bc = Math.abs(b-c);

		if(ac<=d || ab<=d && bc<=d) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}