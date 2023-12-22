
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int nfh = x/500;
		int f = (x%500)/5;

		System.out.println(1000*nfh+5*f); 
	}

 }

	