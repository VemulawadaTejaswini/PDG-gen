import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		int a=0,b=0;
		for(int i = 0;i<4;i++){
			a+=cin.nextInt();
		}
		for(int i = 0;i<4;i++){
			b+=cin.nextInt();
		}
		System.out.println(Math.max(a, b));
	}

}