import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String card;
		String tmp1,tmp2;
		int n;
		int num;
		while(true) {
			card = sc.next();
			if(card.equals("-")) break;
			n = sc.nextInt();

			for(int i=0;i < n;i++) {
				num = sc.nextInt();
				tmp1 = card.substring(0, num);
				tmp2 = card.substring(num,card.length());
				card = tmp2+tmp1;
			}

			System.out.println(card);
		}

		sc.close();

	}

}
