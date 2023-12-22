import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		if(set.size() == 2) System.out.println("Yes");
		else System.out.println("No");
		scan.close();
	}

}