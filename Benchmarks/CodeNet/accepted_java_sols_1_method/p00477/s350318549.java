import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int sum = 0;
		for(int i=0; i<4; i++){
			int x = stdIn.nextInt();
			sum += x;
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}