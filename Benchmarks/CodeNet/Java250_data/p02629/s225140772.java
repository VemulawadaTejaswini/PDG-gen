import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		String ans = "";
		Stack<Character> seq = new Stack<Character>();
		while (N>0) {
			N--;
			char cur = (char)(N%26+97);
			seq.push(cur);
			N/=26;
		}
		while (!seq.isEmpty()) {
			char cur = seq.pop();
			System.out.print(cur);
		}
	}
}