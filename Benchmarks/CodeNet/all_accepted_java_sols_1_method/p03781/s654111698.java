import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		long y = Math.round(Math.ceil((Math.sqrt(2*x + .25) - .5)));
		System.out.println(y);
	}
}