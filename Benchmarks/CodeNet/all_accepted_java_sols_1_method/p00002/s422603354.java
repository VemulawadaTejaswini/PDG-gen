import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String[] array = (sc.nextLine().split(" "));
			int result = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
			System.out.println(String.valueOf(result).length());
		}
	}
}