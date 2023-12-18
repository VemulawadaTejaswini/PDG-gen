import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			al.add(a);
		}
		Collections.sort(al);
		for (int j = 0; j < 3; j++) {
			System.out.println(al.get(9 - j));
		}
	}
}
