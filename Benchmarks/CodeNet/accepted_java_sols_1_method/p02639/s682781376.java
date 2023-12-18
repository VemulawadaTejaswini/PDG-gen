import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		// code to read values
		// code to call required method
		// code to display the result
		// System.out.println(Math.ceil(2.5));
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
			if(arr[i]==0) System.out.println(i+1);
		}
	}
}