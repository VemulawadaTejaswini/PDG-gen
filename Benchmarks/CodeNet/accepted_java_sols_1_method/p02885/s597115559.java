import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

public class Main{
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a<(b*2)) {
			System.out.println(0);
		}
		else {
			System.out.println((a)-(b*2));
		}

	}
}