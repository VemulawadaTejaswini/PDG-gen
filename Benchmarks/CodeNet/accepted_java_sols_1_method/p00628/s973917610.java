import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			String line = sc.nextLine();
			if(line.equals("END OF INPUT")) break;

			ArrayList<Integer> al = new ArrayList<Integer>();

			for(int i = 0; i < line.length(); i++) {
				int p = 0;
				while(i + p != line.length() && line.charAt(i + p) != ' ') p++;
				al.add(p);
				i += p;
			}
			for(int n : al) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}