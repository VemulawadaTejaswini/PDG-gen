import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		ArrayList<String> listSY = new ArrayList<String>();

		try(Scanner scan = new Scanner(System.in)) {
			while(true) {
				int numA = scan.nextInt();
				String sym = scan.next();
				int numB = scan.nextInt();

				if(sym.equals("?")) {
					break;
				}
				listA.add(numA);
				listB.add(numB);
				listSY.add(sym);
			}
			for(int i = 0; i < listSY.size(); i++) {
				if(listSY.get(i).equals("+")) {
					System.out.println(listA.get(i) + listB.get(i));
				} else if(listSY.get(i).equals("-")) {
					System.out.println(listA.get(i) - listB.get(i));
				} else if(listSY.get(i).equals("*")) {
					System.out.println(listA.get(i) * listB.get(i));
				} else if(listSY.get(i).equals("/")) {
					System.out.println(listA.get(i) / listB.get(i));
				}
			}
		}
	}
}