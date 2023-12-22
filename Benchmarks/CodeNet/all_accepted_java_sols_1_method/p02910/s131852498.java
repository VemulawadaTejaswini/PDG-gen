import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] s = scn.nextLine().toCharArray();

		boolean can = true;
		for(int i = 0;i < s.length;i++) {
			if(i%2 == 0) {
				if(s[i] == 'L')can = false;
			}else {
				if(s[i] == 'R')can = false;
			}

			if(!can)break;
		}
		System.out.println(can?"Yes":"No");
	}

}