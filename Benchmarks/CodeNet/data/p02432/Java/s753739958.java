import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<Integer>();

        for(int i = 0; i < n; i++) {
        	int query = sc.nextInt();
       		int d = sc.nextInt();

        	switch(query) {
        	case 0:
        		int x = sc.nextInt();
        		if(d == 0) deque.addFirst(x);
        		else deque.addLast(x);
        		break;

        	case 1:
        		Iterator<Integer> iterator = deque.iterator();
        		for(int j = 0; j < d; j++) {
        			iterator.next();
        		}
        		System.out.println(iterator.next());
        		break;

        	case 2:
        		if(d == 0) deque.removeFirst();
        		else deque.removeLast();
        		break;
        	}
        }
	}
}

