import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, a[][]  = new int[4][13], j, x;
		for(int i = 0;i < 4;i++)
		Arrays.fill(a[i], 0);
		String s;
		n = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			s = scanner.next();
			x = scanner.nextInt();
			if(s.equals("S"))
				j = 0;
			else if(s.equals("H"))
				j = 1;
			else if(s.equals("C"))
				j = 2;
			else if(s.equals("D"))
				j = 3;
			else
				j = 0;
			a[j][x-1] = 1;
		}
		for(int i = 0;i < 4;i++) {
			for(int k = 0;k < 13;k++)
				if(a[i][k] == 0) {
					if(i == 0)
						s = "S";
					else if(i == 1)
						s = "H";
					else if(i == 2)
						s = "C";
					else if(i == 3)
						s = "D";
					else s = "";
					System.out.println(s + " " + (k+1));
				}
		}
		scanner.close();
	}
}