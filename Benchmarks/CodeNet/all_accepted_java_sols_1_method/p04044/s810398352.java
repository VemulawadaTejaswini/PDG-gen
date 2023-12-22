import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int length = sc.nextInt();
		ArrayList<String> starray = new ArrayList<String>();
		for(int i = 0; num >= i; i++) {
			starray.add(sc.nextLine());
		}
		sc.close();
		Collections.sort(starray);
		for(int a = 0; starray.size() > a; a++) {
			System.out.print(starray.get(a));
		}
	}

}
