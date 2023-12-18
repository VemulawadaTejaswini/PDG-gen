import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0028/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		while(sc.hasNext()) {
			int key = sc.nextInt();
			int value = 0;
			if( map.containsKey(key) ) value = map.get(key);
			map.put(key, value + 1);
		}
		int most = 0;
		for(int value : map.values()) {
			most = max(most, value);
		}
		for(int key : map.keySet()) {
			if( most == map.get(key))
				System.out.println(key);
		}
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}