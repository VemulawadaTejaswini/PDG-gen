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

        	if(query == 0) {
        		int d = sc.nextInt();
        		int x = sc.nextInt();
        		if(d == 0) deque.addFirst(x);
        		else deque.addLast(x);
        	}

        	else if(query == 1) {
        		Iterator<Integer> iterator = deque.iterator();
        		int p = sc.nextInt();  //pの要素を取り出したい
        		for(int j = 0; j < p; j++) {
        			iterator.next();
        		}
        		System.out.println(iterator.next());
        	}

        	else {
        		int d = sc.nextInt();
        		if(d == 0) deque.removeFirst();
        		else deque.removeLast();
        	}
        }
	}
}

