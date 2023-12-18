import java.util.Scanner;
class Main {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int t;
		
		t = in.nextInt();
		
		System.out.println((t / 3600) + ":" + (t % 3600 / 60) + ":" + (t % 3600 % 60));
		
	}
}