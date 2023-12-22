import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> card = new ArrayList<Integer>();
		ArrayList<Integer> take = new ArrayList<Integer>();
		while(true){
			int n = in.nextInt();
			int r = in.nextInt();
			if(n==0 && r==0) break;
			for(int i=0; i<n; i++){
				card.add(n-i);
			}
			for(int i=0; i<r; i++){
				int p = in.nextInt();
				int c = in.nextInt();
				for(int j=0; j<p-1; j++){
					take.add(card.get(j));
				}
				for(int j=0; j<c; j++){
					card.set(j, card.get(j+p-1));
				}
				for(int j=0; j<p-1; j++){
					card.set(j+c, take.get(j));
				}
				take.clear();
			}
			System.out.println(card.get(0));
			card.clear();
		}
	}
}