import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int r = io.nextInt();
		int g = io.nextInt();
		int b = io.nextInt();
		
		System.out.println(((10*g+b)%4==0)?"YES":"NO");
	}
}