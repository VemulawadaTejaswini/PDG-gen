import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();
		List<Integer> inputline = stdIn.getLine();
		int x = inputline.get(0);
		int y = inputline.get(1);
		int q,r;

		while(true) {
			q = x / y;
			r = x % y;
			if (r == 0) {
				System.out.println(y);
				break;
			} else {
				x = y;
				y = r;
			}
		}
	}
}
class Input{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Input() {
	}

	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}

	public List<Integer> getLine() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<Integer> ary = new ArrayList<>();
			for (int i = 0; i < s.length; i++) {
				ary.add(Integer.parseInt(s[i]));
			}
			return ary;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}