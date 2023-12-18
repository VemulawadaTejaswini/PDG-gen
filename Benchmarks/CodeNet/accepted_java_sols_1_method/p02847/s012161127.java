import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		int answer = 0;
		
		switch (S) {
		case "SUN":
			answer = 7;
			break;
		case "MON":
			answer = 6;
		    break;
		case "TUE":
			answer = 5;
		    break;
		case "WED":
			answer = 4;
		    break;
		case "THU":
			answer = 3;
		    break;
		case "FRI":
			answer = 2;
		    break;
		case "SAT":
			answer = 1;
		    break;
		}
		
		System.out.println(answer);
		scan.close();
	}
}