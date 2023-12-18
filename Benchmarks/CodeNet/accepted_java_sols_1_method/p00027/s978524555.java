import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[] days = {
				31, 29, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31
		};
		
		String str = "";
		while (sc.hasNextLine() == true) {
			str = sc.nextLine();
			if (str.equals("0 0")) break;
			
			String[] params = str.split(" ");
			int month = Integer.parseInt(params[0]);
			int day = Integer.parseInt(params[1]);
			
			int seven = day;
			for (int i = 1; i < month; i++) {
				seven = seven + days[i - 1];
			}
			
			seven = seven % 7;
			
			switch (seven) {
			case 0:
				System.out.println("Wednesday");
				break;
			case 1:
				System.out.println("Thursday");
				break;
			case 2:
				System.out.println("Friday");
				break;
			case 3:
				System.out.println("Saturday");
				break;
			case 4:
				System.out.println("Sunday");
				break;
			case 5:
				System.out.println("Monday");
				break;
			case 6:
				System.out.println("Tuesday");
				break;
			}
		}
	}
}