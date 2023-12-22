import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int daily = sc.nextInt();
			int weekly = sc.nextInt();
			int target = sc.nextInt();

			int week = 7*daily+weekly;

			int days = (target/week)*7;
			if ((target%week)/daily >= 7 ) days+= 7;
			else {
				days += (target%week)/daily;
				if ((target%week)%daily != 0) days++;
			}
			System.out.println(days);
		}
	}
}

