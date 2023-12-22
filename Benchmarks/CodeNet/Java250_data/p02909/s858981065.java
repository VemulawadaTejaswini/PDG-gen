import java.util.*;
import java.io.*;

class Main {

	void solve () {

		HashMap<String, String> map = new HashMap<>();
		map.put("Sunny", "Cloudy");
		map.put("Cloudy", "Rainy");
		map.put("Rainy", "Sunny");
		System.out.println(map.get(in.next()));
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}