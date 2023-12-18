import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> u = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			int p = sc.nextInt();
			if(!u.contains(p)) {
				u.add(p);
			}
		}
		System.out.println(u.size());
	}

}
