import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			ArrayList<Integer> query = new ArrayList<>();
			for(int i = 0;i < q;i++) {
				int mode = sc.nextInt();
				switch(mode) {
				case 0:
					int x = sc.nextInt();
					query.add(x);
					break;
				case 1:
					int p = sc.nextInt();
					System.out.println(query.get(p));
					break;
				case 2:
					query.remove(query.size()-1);
					break;
				}
			}
		}
	}
}

