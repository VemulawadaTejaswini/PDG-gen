import java.util.Scanner;

public class Main{

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x; 
		x = in.nextInt();
		System.out.println(x * x * x);
	}
}