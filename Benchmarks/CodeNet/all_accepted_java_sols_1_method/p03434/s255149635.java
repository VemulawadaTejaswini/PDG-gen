import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		List<Integer> cards = new ArrayList();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			cards.add(a);
		}
		
		Collections.sort(cards);
		Collections.reverse(cards);
		
		
		int Alice = 0;
		int Bob = 0;
		
		for(int i = 0; i < cards.size(); i = i + 2) {
			Alice += cards.get(i);
			if(i+1 < cards.size()) {
				Bob += cards.get(i+1);	
			}
		}
		
		
		
		int sum = Alice - Bob;
		
		System.out.println(sum);
		
		
	}

}
