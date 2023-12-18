import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int N = 0;
		for (int i = 1; i <= 5; i++) {
			if (input.nextInt()==0) N = i;
		}
		System.out.println(N);
	}	
}