import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final int number;
			switch (ord) {
			case "insert":
				number = scan.nextInt();
				array.add (number);
				break;
			case "delete":
				number = scan.nextInt();
				for (int j = array.size() - 1; j >= 0; j--) {
					if (array.get(j) == number) {
						array.remove(j);
						break;
					}
				}
				break;
			case "deleteFirst":
				array.remove(0);
				break;
			case "deleteLast":
				array.remove(array.size() - 1);
			break;
			}
			
		}
		scan.close ();
		
		for(int i = 0; i < array.size(); i++) {
			if (i == array.size() - 1) System.out.println(array.get(i));
			else System.out.print(array.get(i) + " ");
		}
	}
	
}

