import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		char a = (char) System.in.read(); 
		char b = (char) System.in.read(); 
		char c = (char) System.in.read(); 
		char d = (char) System.in.read(); 
		int num = 0;
		if (a=='+') {
			num++;
		}
		else {
			num--;
		}
		if (b=='+') {
			num++;
		}
		else {
			num--;
		}
		if (c=='+') {
			num++;
		}
		else {
			num--;
		}
		if (d=='+') {
			num++;
		}
		else {
			num--;
		}
		System.out.println(num);
	}
}