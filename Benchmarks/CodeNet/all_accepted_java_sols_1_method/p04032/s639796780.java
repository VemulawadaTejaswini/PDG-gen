import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String line = scanner.next();

		int left = -1;
		int right = -1;	

		for (int i = 2; i < 4; i++) {
			for (int j = 0; j <= line.length() - i; j++) {
				String target = line.substring(j, j+i);
				if (target.substring(0, 1).equals(target.substring(i-1, i))) {
					left = j + 1;
					right = j+i;
					break;
				}
			}
			if (left > -1 && right > -1) {
				break;
			}
		}

		System.out.println(left + " " + right);

		scanner.close();
	}

}
