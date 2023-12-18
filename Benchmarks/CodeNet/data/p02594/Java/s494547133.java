package javacp;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(t>=30?"Yes":"No");
		in.close();
	}
}
