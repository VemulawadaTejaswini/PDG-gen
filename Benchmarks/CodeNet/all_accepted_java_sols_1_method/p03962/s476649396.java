import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		Set<Integer> color = new HashSet<Integer>();

		color.add(scanner.nextInt());
		color.add(scanner.nextInt());
		color.add(scanner.nextInt());
		System.out.println(color.size());
		scanner.close();
	}

}
