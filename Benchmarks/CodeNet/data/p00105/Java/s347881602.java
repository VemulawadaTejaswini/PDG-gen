import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0105/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aojxxxx/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		Map<String, ArrayList<Integer>> mp = new HashMap<String, ArrayList<Integer>>();
		ArrayList<String> ss = new ArrayList<String>();
		for (;sc.hasNext();) {
			String str = sc.next();
			int index = sc.nextInt();
			if(mp.get(str) == null) {
				mp.put(str, new ArrayList<Integer>());
				ss.add(str);
			}
			mp.get(str).add(index);
		}
		Collections.sort(ss);
		for (String str : ss) {
			System.out.println(str);
			ArrayList<Integer> list = mp.get(str);
			Collections.sort(list);
			boolean first = true;
			for (int x : list) {
				if (first) first = false;
				else System.out.print(" ");
				System.out.print(x);
			}
			System.out.println();
		}
	}
}