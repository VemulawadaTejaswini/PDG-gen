import java.util.Scanner;

class Main {
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(x*y + " " + 2*(x+y));
	}
}