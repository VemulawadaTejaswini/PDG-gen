import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int g = scn.nextInt();
		int b = scn.nextInt();

		int num = r * 100 + g * 10 + b;
		if(num % 4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
