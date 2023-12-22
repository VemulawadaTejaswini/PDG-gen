import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			String cards = sc.next();
			if(cards.equals("-")) break;
			int shuffleNum = sc.nextInt();

			StringBuilder sb = new StringBuilder(cards);
			for(int i=0; i<shuffleNum; i++) {
				int h = sc.nextInt();
				String cutStr = sb.substring(0, h);
				sb.delete(0, h);
				sb.append(cutStr);
			}
			System.out.println(sb.toString());
		}

		sc.close();

	}

}
