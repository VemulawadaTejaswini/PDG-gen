import java .util.ArrayList;
import java.util.Collections;
import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList<Integer> inA = new ArrayList<>();

	int inputN = sc.nextInt();
	Boolean boo = true;

	for(int i = 0; i < inputN; i++) {
		inA.add(sc.nextInt());
	}

	Collections.sort(inA, Collections.reverseOrder());

	for(int i = 0; i < inputN-1; i++) {
		int n = inA.get(i);
			if(n == inA.get(i + 1)) {
				boo = false;
				break;

		}

	}

	if(boo == true) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}

}
}
