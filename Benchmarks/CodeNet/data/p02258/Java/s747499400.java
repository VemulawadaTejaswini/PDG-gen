import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();
		int n = stdIn.getValue();
		List<Integer> r = stdIn.getValueLines(n);

		int maxv = 0;
		int minv;

//		System.out.println(n);
//		System.out.println(r);

		maxv = r.get(1) - r.get(0);
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if((r.get(j) - r.get(i)) > maxv) {
					maxv = r.get(j) - r.get(i);
				}
//				System.out.println("j[" + j+"]:"+r.get(j)  + " i[" + i +"]:"+ r.get(i) +" maxv:" + maxv);
			}
		}
		System.out.println(maxv);

		stdIn.close();
	}
}
class Input {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}

	public List<Integer> getValueLines(int n) {
		List<Integer> values = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			values.add(getValue());
		}
		return values;
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