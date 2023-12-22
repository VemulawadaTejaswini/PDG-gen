
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int array[]= new int[5];
		String msg  = "Yay!";
		for (int i = 0; i < 5; i++) {
			array[i] =sc.nextInt();
		}
		int tag = sc.nextInt();
		Arrays.sort(array);
		if (array[4] - array[0]  > tag) {
			msg = ":(";
		}
		
		System.out.println(msg);
	}
}