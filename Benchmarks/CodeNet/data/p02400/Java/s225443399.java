import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		System.out.printf("%.8f %.8f", R * R * Math.PI, 2 * R * Math.PI);
	}
}
