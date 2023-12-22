import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int quotient = a/b;
		int rest = a%b;
		String str = String.format("%.6f", 1.0*a/b);
		


		System.out.println(quotient+" "+rest+" "+str);
	}
}