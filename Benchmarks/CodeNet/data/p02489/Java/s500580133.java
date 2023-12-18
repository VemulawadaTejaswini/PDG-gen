import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		for(int r = 0; ; r++) {
			int x = stdIn.nextInt();
			if(x == 0) break;
			System.out.println("Case " + (r + 1) + ": " + x);
		}
	}

}