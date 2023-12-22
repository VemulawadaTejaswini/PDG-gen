import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a+b > c+d) System.out.println("Left");
		else if(c+d > a+b) System.out.println("Right"); 
		else System.out.println("Balanced");
	}
}