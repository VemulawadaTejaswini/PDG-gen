import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		int min = X - K + 1;
		int max = X + K -1;
		LinkedList<Integer> ansList = new LinkedList<Integer>();
		
		for(int i = min; i <= X; i++) {
			ansList.add(i);
		}
		
		for(int i = X + 1; i <= max; i++) {
			ansList.add(i);
		}
		
		for(int i = 0; i < ansList.size() ; i++ ) {
			if ( i > 0 ) {
				System.out.print(" ");
			}
			System.out.print(ansList.get(i));
		}

		sc.close();
	}
}
