import java.util.*;
import java.io.*;

public class Cube {
	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		x = sc.nextInt();
		System.out.println(x*x*x);
		
		sc.close();
	}

}