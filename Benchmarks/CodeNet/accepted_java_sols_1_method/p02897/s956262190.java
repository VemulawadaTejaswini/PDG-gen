import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		double n = sc.nextInt();
		double div = n;
		double count = 0;
		while (n>=1) {
			if (n%2 == 1) {
				count++;
			}
			n--;
		}
		double val = count / div;
		System.out.printf("%.10f \n", val);
	}
}
