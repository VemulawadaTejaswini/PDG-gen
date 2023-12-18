
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for (int i=0; i<size; i++) {
			String ops = sc.next();
			if ("insert".equals(ops))
				ll.add(0, sc.nextInt());
			else if ("delete".equals(ops)) {
				int pos = ll.indexOf(sc.nextInt());
				if (pos>=0) ll.remove(pos);
			}
			else if ("deleteFirst".equals(ops))
				ll.removeFirst();
			else if ("deleteLast".equals(ops))
				ll.removeLast();
			
		}
		sc.close();

		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append(ll.poll());
        for (Integer s : ll) {
            sb.append(" ");
            sb.append(s);
        }
        bw.write(sb.toString());
        bw.newLine();
        bw.close();
		
	}

}

