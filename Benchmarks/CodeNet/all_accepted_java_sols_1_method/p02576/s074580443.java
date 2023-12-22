import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int t = scn.nextInt();
		int fac = n/x;
		if(n%x!=0)
			fac++;
		System.out.println(fac*t);

	}



}
