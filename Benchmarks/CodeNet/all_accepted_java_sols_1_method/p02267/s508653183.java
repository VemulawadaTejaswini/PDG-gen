import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));
		scanner.nextLine();
		int count=0;
		for(String str: scanner.nextLine().split(" ")) {
			if(arr1.contains(str)) {
				count++;
			}
		}
		System.out.println(count);

	}
}

