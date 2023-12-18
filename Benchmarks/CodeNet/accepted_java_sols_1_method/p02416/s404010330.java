import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		while( !row.equals("0")) {
			int rowTotal = 0;
			String[] str = row.split("");
			for(int i = 0; i < str.length; i++) {
			   rowTotal += Integer.valueOf(str[i]);
			}
			System.out.println(rowTotal);
			row = scan.nextLine();
		}
	}
}

