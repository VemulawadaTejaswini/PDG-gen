import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static final int uncal = -1;
	static final int mod = (int) (1e9)+7;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		int n = sc.nextInt()%1000;
		if(n > 0)
			n = 1000-n;
		out.println(n);
		out.close();
	}
}