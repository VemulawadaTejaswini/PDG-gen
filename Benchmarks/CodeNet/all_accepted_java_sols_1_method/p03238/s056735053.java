import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
		if(N == 1) {
			System.out.println("Hello World");
		}
		else {
			int A = sc.nextInt(), B = sc.nextInt();
			System.out.println(A + B);
		}
	}
}