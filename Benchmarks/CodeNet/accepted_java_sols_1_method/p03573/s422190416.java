import java.util.*;
import java.util.stream.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] abc = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (abc[0] == abc[1]) {
			System.out.println(abc[2]);
		} else if (abc[1] == abc[2]) {
			System.out.println(abc[0]);
		} else {
			System.out.println(abc[1]);
		}
	}
}
