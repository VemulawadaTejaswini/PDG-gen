import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);

		while(true) {
			String card = sc.next();
			if(card.equals("-"))
				break;

			int	count = sc.nextInt();
			for(int i=0; i<count; i++){
				int shuffle = sc.nextInt();
				String head=card.substring(0,shuffle);
				String tail=card.substring(shuffle);
				card=tail + head;
			}
			System.out.println(card);
		}
	}
}

