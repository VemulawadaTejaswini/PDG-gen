import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ALDS1_3_c {
  public static void main(String[] args) throws NumberFormatException, IOException {
	//long start = System.nanoTime();

	//System.setIn(new FileInputStream("./ALDS1_3_C-in10.txt"));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	final int n = Integer.parseInt(br.readLine());
	Deque<Integer> d = new ArrayDeque<Integer>();
	
	String[] com;
	for(int i = 0; i < n; ++i) {
		com = br.readLine().split(" ");
		switch(com[0]) {
			case "insert":
				d.addFirst(Integer.parseInt(com[1]));
				break;
			case "delete":
				d.remove(Integer.parseInt(com[1]));
				break;
			case "deleteLast":
				d.removeLast();
				break;
			case "deleteFirst":
				d.remove();
				break;
		}
	}
	
	PrintWriter out = new PrintWriter(System.out);
	if(d.size() > 0) {
		out.print(d.pop());
	}
	for(int i : d) {
		out.print(" " + i);
	}
	out.println();
	out.flush();
	
	//System.out.println("Time:" + (System.nanoTime() - start) / 1000000f + " ms");
  }
}