import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int point1 = 0;
		int point2 = 0;

		for(int i = 0;i < count;i++) {
			String card1 = sc.next();
			String card2 = sc.next();
			if(card1.compareTo(card2) > 0){
				point1 += 3;
			} else if (card1.compareTo(card2) < 0) {
				point2 += 3;

			} else {
				point1 += 1;
				point2 += 1;
			}

		}
		System.out.println(point1 + " " + point2);



	}
}