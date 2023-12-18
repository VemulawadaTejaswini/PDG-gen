import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		double total = 0;
		double products = sc.nextInt();
		double popular = sc.nextInt();
		boolean pass = true;
		ArrayList<Integer> votenum = new ArrayList<Integer>();

		for(int i = 0; i < products; i++) {
			int vote = sc.nextInt();
			votenum.add(i, vote);
			total += vote;
		}

		sc.close();
		Collections.sort(votenum, Collections.reverseOrder());
		double comparison = total / (4 * popular);

		for(int i = 0; i < popular;  i++) {
			 if(votenum.get(i)  < comparison) {
				 pass = false;
				 break;
			 }
		}
		if(pass == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}