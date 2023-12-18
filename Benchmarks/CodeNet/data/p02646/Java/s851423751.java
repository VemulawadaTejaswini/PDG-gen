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
		if (diff*T>=altC-itCoord&&diff*T>=0&&altC-itCoord>=0) {
			System.out.println("YES");
		}else if (diff*T<=0&&altC-itCoord<=0&&diff*T<altC-itCoord) System.out.println("YES");
		else System.out.println("NO");
	}
}