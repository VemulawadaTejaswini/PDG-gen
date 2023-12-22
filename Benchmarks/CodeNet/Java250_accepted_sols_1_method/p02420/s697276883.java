import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String pile = in.nextLine();
			if(pile.equals("-")) return;
			int m = in.nextInt();
			for(int i=0;i<m;i++) {
				int p = in.nextInt();
				String l = pile.substring(0, p);
				String r = pile.substring(p);
				pile = r + l;
			}
			in.nextLine();
			System.out.println(pile);
		}
	}
}