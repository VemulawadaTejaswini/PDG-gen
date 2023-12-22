import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int left = in.nextInt() + in.nextInt();
		int right = in.nextInt() + in.nextInt();
 
		if(left > right) {
			System.out.println("Left");
 
		} else if(left < right) {
			System.out.println("Right");
		} else 
		System.out.println("Balanced");
 	}
}