import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		for(int i=1;i<input.length;i++) {
			if(input[i]==input[i-1]) {System.out.println("Bad"); return;}
		}
		System.out.println("Good");
		
	}
}
