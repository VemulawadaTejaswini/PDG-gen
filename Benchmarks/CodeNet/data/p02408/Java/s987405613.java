import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] s = new int[13];
		int[] h = new int[13];
		int[] c = new int[13];
		int[] d = new int[13];

		for(int i = 0; i < 13; i++) {
			s[i] = 1;
			h[i] = 1;
			c[i] = 1;
			d[i] = 1;
		}

		String[] deleteMark = new String[n];
		int[] deleteRank = new int[n];

		for(int i = 0; i < n; i++) {
			deleteMark[i] = sc.next();
			deleteRank[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {

			switch (deleteMark[i]) {

			case ("S"):
				s[deleteRank[i]-1] = 0;
			break;

			case ("H"):
				h[deleteRank[i]-1] = 0;
			break;

			case ("C"):
				c[deleteRank[i]-1] = 0;
			break;

			case ("D"):
				d[deleteRank[i]-1] = 0;
			break;

			}

		}

		for(int i = 0; i < 13; i++) {

			if(s[i] == 1) System.out.println("S " + (i+1));

		}

		for(int i = 0; i < 13; i++) {

			if(h[i] == 1) System.out.println("H " + (i+1));

		}

		for(int i = 0; i < 13; i++) {

			if(c[i] == 1) System.out.println("C " + (i+1));

		}

		for(int i = 0; i < 13; i++) {

			if(d[i] == 1) System.out.println("D " + (i+1));

		}

	}

}



