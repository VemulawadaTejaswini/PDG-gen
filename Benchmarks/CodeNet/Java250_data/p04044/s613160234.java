import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)  {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt(),m = in.nextInt();;	
	ArrayList<String> a = new ArrayList<>(n);
	for (int i = 0; i < n; i++) {
		String y = in.next();
		a.add(y);
	}
	Collections.sort(a);	
	for (int i = 0; i < n; i++) {
		System.out.print(a.get(i));
	}	
	System.out.println();
		
	}
	
}

