import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		// TODO ?????????????????????????????????????????????
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> deck = new ArrayList<Integer>();
		ArrayList<Integer> deckout = new ArrayList<Integer>();
		while(true){
			int n = scn.nextInt();
			int r = scn.nextInt();
			if(n==0&&r==0) break;
			for(int k=0;k<n;k++){
				deck.add(n-k);
			}
			for(int k=0;k<r;k++){
				int p = scn.nextInt();
				int c = scn.nextInt();
				for(int i=0;i<c;i++){
					deck.add(0,deck.remove(p-2+c));
				}
			}
			deckout.add(deck.get(0));
			deck.clear();

		}
		for(Integer i:deckout){
			System.out.println(i);
		}

		scn.close();
	}
}