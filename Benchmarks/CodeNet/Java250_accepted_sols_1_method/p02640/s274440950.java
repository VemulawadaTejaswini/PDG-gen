import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int b = 0;
		String ans = "No";
		for(int a = 0; a < X+1; a++){
			b = X - a;
			if(2 * a + 4 * b == Y){
				ans = "Yes";
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}