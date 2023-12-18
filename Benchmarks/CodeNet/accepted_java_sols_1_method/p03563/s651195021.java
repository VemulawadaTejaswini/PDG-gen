import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int r = stdIn.nextInt(); //現在のレーティング
		int g = stdIn.nextInt(); //とりたいレーティング
		
		System.out.println(2*g-r);
		
		
		
	}

}
