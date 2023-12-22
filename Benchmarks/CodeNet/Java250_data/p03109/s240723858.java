import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		String s = sc.nextLine();
		String[] t = s.split("/");
		int[] n = new int[3];
		for (int i=0; i<3; i++) n[i] = Integer.parseInt(t[i]); 
		if (n[0]<2019) {
			System.out.println("Heisei");
		} else if (n[0]==2019) {
			if (n[1]<4) System.out.println("Heisei");
			else if (n[1]==4) {
				if (n[2]<=30) System.out.println("Heisei");
				else System.out.println("TBD");
			} else System.out.println("TBD");
		} else System.out.println("TBD");
		
		
		
		
	}
}
