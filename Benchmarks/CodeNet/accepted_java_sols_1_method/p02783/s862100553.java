import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.Set;
 
public class Main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;
	//static int count = 0;
 
	public static void main(String[] args) {
		int h=scn.nextInt();
		int a=scn.nextInt();
		int count=1;
		while(h>a)
		{
			h=h-a;
			count++;
		}
		System.out.println(count);
	}
}