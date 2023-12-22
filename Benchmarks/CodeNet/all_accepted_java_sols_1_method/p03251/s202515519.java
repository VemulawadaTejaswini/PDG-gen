
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nx = scan.nextInt();
		int ny = scan.nextInt();
		int capitalx = scan.nextInt();
		int capitaly = scan.nextInt();
		
		List<Integer> listx = new ArrayList<>();
		listx.add(capitalx);
		for (int i = 0; i < nx; i++) {
			listx.add(scan.nextInt());
		}
		Collections.sort(listx);
		
		List<Integer> listy = new ArrayList<>();
		listy.add(capitaly);
		for (int i = 0; i < ny; i++) {
			listy.add(scan.nextInt());
		}
		Collections.sort(listy);
		
		if (listx.get(listx.size() - 1) < listy.get(0)) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
		
		
		
	}
}