
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] abo = new int[4];
		while (scanner.hasNext()) {
			
			String str = scanner.nextLine().split(",")[1];
			if (str.equals("A"))
				abo[0]++;
			else if (str.equals("B"))
				abo[1]++;
			else if (str.equals("AB"))
				abo[2]++;
			else
				abo[3]++;
		}
		for (int t : abo)
			System.out.println(t);
	}

}