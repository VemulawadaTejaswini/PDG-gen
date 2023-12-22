import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		while(stdIn.hasNext()) {
			double a = stdIn.nextDouble();
			max = Math.max(a, max);
			min = Math.min(min, a);
		}
		System.out.println(max - min);
	}
}