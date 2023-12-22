import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] s = S.split("/");
		int[] date = new int[3];
		boolean tbd = false;
		for(int i = 0; i < 3; i++) date[i] = Integer.parseInt(s[i]);
		if(date[0] == 2019 && date[1] > 4) tbd = true;
		if(date[0] > 2019) tbd = true;
		if(tbd) System.out.println("TBD");
		else System.out.println("Heisei");
	}

}
