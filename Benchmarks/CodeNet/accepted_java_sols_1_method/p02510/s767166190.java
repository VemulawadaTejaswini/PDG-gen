import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, m, len;
		String tmp, card;
		while(true){
			card = sc.next();
			if (card.equals("-"))
				break;
			len = card.length();
			n = sc.nextInt();
			for(i = 0; i < n; i++){
				m = sc.nextInt();
				tmp = card;
				card = tmp.substring(m, len) + tmp.substring(0, m);
			}
		System.out.println(card);
		}
	}
}