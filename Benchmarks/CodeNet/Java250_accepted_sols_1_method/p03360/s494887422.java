import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int x = sc.nextInt();
    	int d = 0;
    	
    	if(a >= b && a >= c) d += b + c + a * (int)Math.pow(2, x);
    	else if(b >= a && b >= c) d += a + c + b * (int)Math.pow(2, x);
    	else if(c >= b && c >= b) d += a + b + c * (int)Math.pow(2, x);
    	System.out.println(d);
	}

}
