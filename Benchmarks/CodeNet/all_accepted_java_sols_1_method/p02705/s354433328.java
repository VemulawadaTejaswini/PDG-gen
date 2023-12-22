import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		double a = Math.PI*2*tt;
		System.out.println(String.format("%.20f", a));
	}
}