import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int n = 0;
		switch(S) {
			case "SUN":
				n = 7;
				break;
			case "MON":
				n = 6;
				break;
			case "TUE":
				n = 5;
				break;
			case "WED":
				n = 4;
				break;
			case "THU":
				n = 3;
				break;
			case "FRI":
				n = 2;
				break;
			case "SAT":
				n = 1;
				break;
		}

		if(S == "SUN") {
			n = 7;
		}else
		System.out.println(n);
	}

}