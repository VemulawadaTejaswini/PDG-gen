import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String alp = "abcdefghijklmnopqrstuvwxyz";
		String cards[][] = new String[n][2];
		int taro = 0;
		int hanako = 0;
		for (int i = 0; i < n; i++) {
			cards[i][0] = sc.next();
			cards[i][1] = sc.next();
		}
		int tarop = 0;
		int hanakop = 0;
		int point = 0;
		for (int i = 0; i < n; i++) {
			while (true) {
				tarop = alp.indexOf(cards[i][0].charAt(point));
				hanakop = alp.indexOf(cards[i][1].charAt(point));
				if (tarop > hanakop) {
					taro += 3;
					break;
				} else if (hanakop > tarop) {
					hanako += 3;
					break;
				} else if (tarop == hanakop && cards[0][i].length() == point) {
					taro++;
					hanako++;
					break;
				} else {
					point++;
				}
			}
			point = 0;
		}
		System.out.println(taro + " " + hanako);
	}
}
