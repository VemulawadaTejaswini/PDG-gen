import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		ArrayList<String> array = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String number;
			int nn = array.size() - 1;
			switch (ord) {
			case "insert":
				number = scan.next();
				array.add (number);
				break;
			case "delete":
				number = scan.next();
				for (int j = nn; j >= 0; j--) {
					if (array.get(j).equals(number)) {
						array.remove(j);
						break;
					}
				}
				break;
			case "deleteFirst":
				array.remove(nn);
				break;
			case "deleteLast":
				array.remove(0);
			break;
			}
			
		}
		scan.close ();
		
		sb.append(array.get(array.size() - 1));
		
		for(int i = array.size() - 2; i >= 0; i--) {
			sb.append(" " + array.get(i));
		}
		
		System.out.println(sb);
	}
	
}
