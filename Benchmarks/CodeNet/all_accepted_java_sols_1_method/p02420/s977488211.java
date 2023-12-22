import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){

			String str = scan.next();
			StringBuilder card = new StringBuilder(str);

			if(str.equals("-"))
				break;

			int m = scan.nextInt();
			int[] shuffle = new int[m];

			for(int i = 0; i < m; i++){
				shuffle[i] = scan.nextInt();
				card.append(card.substring(0,shuffle[i]));
				card.delete(0, shuffle[i]);
			}
			System.out.println(card);

		}

	}

}