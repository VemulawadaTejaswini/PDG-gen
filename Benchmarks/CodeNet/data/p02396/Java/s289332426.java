import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		int n = 1;
		int x;
		while(bl){
			x = stdIn.nextInt();
			if(x == 0) break;
			System.out.println("Case " + n + ": " + x);
			n++;
		}
	}

}