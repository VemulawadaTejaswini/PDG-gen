import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			if(s.equals("-"))	break;
			int m = Integer.parseInt(sc.nextLine());
			for(int i=0; i < m; i++) {
				int h = Integer.parseInt(sc.nextLine());
				String head = s.substring(0, h);
				String tail = s.substring(h);
				s = tail + head;
			}
			System.out.printf("%s\n", s);
		}
	}
}

