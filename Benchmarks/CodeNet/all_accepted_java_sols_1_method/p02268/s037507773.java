import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		HashSet<String> set1 = new HashSet<>(Arrays.asList(scanner.nextLine().split(" ")));
		scanner.nextLine();
		int count=0;
		for(String str: scanner.nextLine().split(" ")) {
			if(set1.contains(str)) {
				count++;
			}
		}
		System.out.println(count);

	}

}

