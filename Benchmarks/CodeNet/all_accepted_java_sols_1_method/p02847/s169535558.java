import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		switch(s){
		case "SUN":
			System.out.println("7");
			return;

		case "MON":
			System.out.println("6");
			return;

		case "TUE":
			System.out.println("5");
			return;

		case "WED":
			System.out.println("4");
			return;

		case "THU":
			System.out.println("3");
			return;

		case "FRI":
			System.out.println("2");
			return;

		case "SAT":
			System.out.println("1");
			return;
			
		}
	}

}
