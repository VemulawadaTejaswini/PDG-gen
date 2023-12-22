import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a*b;
		a *= 2;
		b *= 2;
		a += b;
		System.out.println(c + " " + a);
	}
}