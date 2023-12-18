import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		int capacity;
		boolean flg = false;
		final int baggage = scan.nextInt();
		final int truck = scan.nextInt();
		final int[] weight= new int[baggage];
		
		
		for (int i : weight) {
			weight[i] = scan.nextInt();
			sum += weight[i];
		}
		scan.close();
		capacity = sum / truck + 1;
		
		while (flg) {
			int starttruck = 0;
			for ( int car = 0; car < truck; car++) {
				sum = 0;
				for (int bag = starttruck; bag < baggage; bag++) {
					sum += weight[bag];
					if ( sum > capacity) {
						starttruck = bag;
						break;
					} else if (car == truck - 1 && bag == baggage - 1) {
						flg = true;
					}
				}
			}
			if ( flg == false) capacity++;
		}
		
		System.out.println(capacity);
		
	}
}

