import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		List<Integer> spade = new ArrayList<Integer>();
		List<Integer> heart = new ArrayList<Integer>();
		List<Integer> club = new ArrayList<Integer>();
		List<Integer> diamond = new ArrayList<Integer>();

		for(int i=0;i<total;i++) {
			char symbol = sc.next().charAt(0);
			int number = sc.nextInt();

			if(symbol=='S') {
				spade.add(number);
			}else if(symbol=='H') {
				heart.add(number);
			}else if(symbol=='C') {
				club.add(number);
			}else if(symbol=='D') {
				diamond.add(number);
			}
		}

		for(int i=1;i<=13;i++) {
			if(!(spade.contains(i))) {
				System.out.println("S "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			if(!(heart.contains(i))) {
				System.out.println("H "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			if(!(club.contains(i))) {
				System.out.println("C "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			if(!(diamond.contains(i))) {
				System.out.println("D "+i);
			}
		}
	}
}

