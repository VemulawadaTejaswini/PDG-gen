import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(1,2,3));
		all.remove(all.indexOf(sc.nextInt()));
		all.remove(all.indexOf(sc.nextInt()));
		System.out.println(all.get(0));
	}
}