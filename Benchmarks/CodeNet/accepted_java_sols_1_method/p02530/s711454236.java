import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] card = new String[2];
		String[] afterCard = new String[2];
		
		int taroPoint = 0, hanakoPoint = 0;
		
		for(int i = 0; i < n; i++) {
			card[0] = sc.next();
			card[1] = sc.next();
			
			if(card[0].equals(card[1])) {
				taroPoint++;
				hanakoPoint++;
			} else {
				afterCard[0] = card[0];
				afterCard[1] = card[1];
				
				Arrays.sort(afterCard);
				
				if(card[0].equals(afterCard[0])) {
					hanakoPoint+=3;
				} else {
					taroPoint+=3;
				}
			}
		}
		
		System.out.println(taroPoint + " " + hanakoPoint);
	}
}