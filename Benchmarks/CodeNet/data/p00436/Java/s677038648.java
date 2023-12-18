import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		ArrayList<Integer> card = new ArrayList<Integer>();

		int n = s.nextInt() * 2;

		for(int i = 0; i < n; i++){
			card.add(i+1);
		}


		int m = s.nextInt();
		for(int i = 0; i < m; i++){
			int k = s.nextInt();
			if(k != 0){
				cut(card, k);

			}
			else{
				riffle(card, n);
			}
		}

		for(int i = 0; i < n; i++){
			System.out.println(card.get(i));
		}

	}

	public static void cut(ArrayList<Integer> a, int n){
		ArrayList<Integer> b = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			b.add(a.get(i));
		}

		for(int i = 0; i < n; i++){
			a.remove(0);
		}

		for(int i = 0; i < n; i++){
			a.add(b.get(i));
		}
	}

	public static void riffle(ArrayList<Integer> a, int n){
		ArrayList<Integer> b = new ArrayList<Integer>();

		for(int i = n/2; i < n; i++){
			b.add(a.get(i));
		}

		int c = 0;
		for(int i = 1; i < n; i=i+2){
			a.add(i, b.get(c++));
		}
		for(int i = 0; i < b.size(); i++){
			a.remove(a.size()-1);
		}
	}


}