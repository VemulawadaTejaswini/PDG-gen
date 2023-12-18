import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		boolean flag = false;
		
		String line = "";
		while (sc.hasNext() == true) {
			line = sc.nextLine();

			flag = false;
			for (int i = 0; i < 10; i++) {
				flag = check(line.replaceAll("X", "" + i));
				
				if (flag == true) {
					System.out.println(i);
					break;
				}
			}
			if (flag == false) System.out.println("NA");
		}
	}
	
	public boolean check(String formula) {
		int[] number = new int[3];
		
		int p = 0;
		for (int i = 0; i < number.length; i++) {
			String snumber = "";
			
			while (Character.isDigit(formula.charAt(p)) == true) {
				snumber = snumber + formula.charAt(p);
				p++;
				
				if (p == formula.length()) break;
			}
			number[i] = Integer.parseInt(snumber);
			
			p++;
		}
		
		if ((number[0] + number[1]) == number[2]) return true;
		else return false;
	}
}