
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			final int n = sc.nextInt();
			final int r = sc.nextInt();
			
			if(n == 0 && r == 0){
				break;
			}
			
			LinkedList<Integer> deck = new LinkedList<Integer>();
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			LinkedList<Integer> tmp2 = new LinkedList<Integer>();
			for(int i = 0; i < n; i++){
				deck.add(n - i);
			}
			
			for(int i = 0; i < r; i++){
				final int p = sc.nextInt();
				final int c = sc.nextInt();
				
				for(int j = 0; j < p - 1; j++){
					tmp.add(deck.removeFirst());
				}
				
				for(int j = 0; j < c; j++){
					tmp2.add(deck.removeFirst());
				}
				
				for(int j = 0; j < p - 1; j++){
					deck.addFirst(tmp.removeLast());
				}
				
				for(int j = 0; j < c; j++){
					deck.addFirst(tmp2.removeLast());
				}
			}
			
			System.out.println(deck.peekFirst());
		}
		
	}
}