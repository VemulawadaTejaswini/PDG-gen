import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> tgt = new ArrayList<Integer>();
	static ArrayList<Integer> ans = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			hit_and_blow();
		}
    }


	private static void hit_and_blow() {
		int h = 0;
		int b = 0;

		for (int i = 0; i < 4; i++) {
			tgt.add( sc.nextInt() );
		}

		for (int i = 0; i < 4; i++) {
			ans.add( sc.nextInt() );
		}

		for (int i = 0; i < 4; i++) {
			if ( tgt.contains( ans.get(i) ) == true){
				if ( ans.get(i) == tgt.get(i) ) {
					h++;
					continue;
				}

				b++;
			}
		}

		System.out.printf("%d %d\n", h, b);
		tgt.clear();
		ans.clear();
	}

}
