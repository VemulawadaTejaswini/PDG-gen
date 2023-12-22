
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Deque<Integer> deque = new ArrayDeque<Integer>();

		int[] b = new int[N];
		for(int i = 0 ; i < N ; i++){
			int p = sc.nextInt();

			if(i%2 ==0){
				deque.addLast(p);
			}
			else{
				deque.addFirst(p);
			}
		}
		if(N%2 ==0){
			for(int i = 0 ; i < N; i++){
				System.out.print(deque.getFirst() + " ");
				deque.removeFirst();
			}
		}
		else{
			for(int i = 0 ; i < N; i++){
				System.out.print(deque.getLast()+" ");
				deque.removeLast();
			}
		}
		sc.close();
	}

}
