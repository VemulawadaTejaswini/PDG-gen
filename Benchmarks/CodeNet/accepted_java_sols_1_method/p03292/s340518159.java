import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> A = new ArrayList<Integer>();
		for(int i=0; i<3; i++){
			A.add(Integer.parseInt(sc.next()));
		}

		Collections.sort(A);

		System.out.println(A.get(2) - A.get(0));
	}
}
