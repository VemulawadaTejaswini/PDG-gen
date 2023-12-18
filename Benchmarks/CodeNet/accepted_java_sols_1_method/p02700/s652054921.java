import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		while (C>0&&A>0) {
			C-=B;
			A-=D;
		}
		System.out.println(C<=0? "Yes":"No");
	}
}