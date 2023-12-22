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
    	int c = a-1;
    	if(b >= a) c += 1;
    	
    	System.out.println(c);
	}

}
