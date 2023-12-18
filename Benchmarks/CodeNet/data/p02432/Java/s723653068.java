import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		ArrayDeque<Integer> deque = new ArrayDeque<>();

		int loop = in.nextInt();
		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next()), wild = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					if(wild == 0 ) deque.addFirst(Integer.parseInt(in.next()));
					else deque.addLast(Integer.parseInt(in.next()));
					break;

				case 1:
					Iterator<Integer> itr = deque.iterator();
					for(int j = 0; j < wild; j++)itr.next();
					out.println(itr.next());
					break;

				case 2:
					if(wild == 0)deque.removeFirst();
					else deque.removeLast();
					break;
			}
		}
		out.flush();
		in.close();
	}

}

