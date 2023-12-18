import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
		int t = scn.nextInt();
		int s = scn.nextInt();
		if(d<=t*s)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
