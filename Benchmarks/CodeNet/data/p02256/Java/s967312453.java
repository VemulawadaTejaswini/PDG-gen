import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();
		List<Integer> inputline = stdIn.getLine();
		int x = inputline.get(0);
		int y = inputline.get(1);

		List<Integer> xDivisor = new ArrayList<>();
		List<Integer> yDivisor = new ArrayList<>();

		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				xDivisor.add(i);
			}
		}
		for (int i = 1; i < y; i++) {
			if (y % i == 0) {
				yDivisor.add(i);
			}
		}

		for (int i = xDivisor.size() - 1; i > 0; i--) {
			for (int j = yDivisor.size() - 1; j > 0; j--) {
				if (xDivisor.get(i).equals(yDivisor.get(j))) {
					System.out.println(yDivisor.get(j));
					System.exit(0);
				}
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