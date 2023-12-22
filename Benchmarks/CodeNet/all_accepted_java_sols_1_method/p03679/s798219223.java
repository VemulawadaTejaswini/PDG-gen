import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(B - A > X) System.out.println("dangerous");
		else System.out.println((B <= A) ? "delicious" : "safe");
	}
}
