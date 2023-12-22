import java.io.InputStream;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args){
		
		Scanner In = new Scanner(System.in);
		
		int x = In.nextInt();
	
		int y = In.nextInt();

		int sum = x * y;

		int sum2 = x * 2 + y * 2;
		
		System.out.print(sum);
		System.out.print(" ");
		System.out.println(sum2);
		
}
}