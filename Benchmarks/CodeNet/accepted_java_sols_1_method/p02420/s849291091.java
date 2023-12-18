import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String card = "";
		int h;
		int m;
		ArrayList<String> al = new ArrayList<>();
		int cnt = 0;
		while(!(card.equals("-"))) {
			card = sc.next();
			char[] cardArray = card.toCharArray();
			if(card.equals("-")) {
				break;
			} else {
				m = sc.nextInt();
				for(int i = 0; i < m; i++) {
					h = sc.nextInt();
					char[] tmp = new char[h];
					for(int j = 0; j < h; j++) {
						tmp[j] = cardArray[j];
					}
					for(int k = 0; k < cardArray.length - h; k++) {
						cardArray[k] = cardArray[k + h];
					}
					for(int l = 0; l < h; l++) {
						cardArray[cardArray.length - h + l] = tmp[l];
					}
				}
				
			}
			cnt++;
			al.add(String.valueOf(cardArray));
		}
		for(int i = 0; i < cnt; i++) {
			System.out.println(al.get(i));
		}

	}
}