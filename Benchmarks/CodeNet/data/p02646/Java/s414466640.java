import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		int itCoord = input.nextInt();
		int itSpeed = input.nextInt();
		int altC = input.nextInt();
		int altS = input.nextInt();
		int T = input.nextInt();
		int diff = itSpeed-altS;
		if (diff*T>=Math.abs(itCoord-altC)) System.out.println("YES");
		else System.out.println("NO");
	}
}