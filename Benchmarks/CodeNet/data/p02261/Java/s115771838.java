import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

	public static void main(String[] args) {

		InputOutput stdIO = new InputOutput();

		int n = stdIO.getValue();
		List<String> slist = stdIO.getLineString();

		List<Cards> values1 = new ArrayList<>();
		List<Cards> values2 = new ArrayList<>();

		Main my = new Main();

		my.listConverter(slist, values1);
		my.listConverter(slist, values2);

		my.bubbleSort(values1, n);
		stdIO.outputLine(values1);
		System.out.println("Stable");

		my.selectionSort(values2, n);
		stdIO.outputLine(values2);

		my.checkOrder(values1, values2);

		stdIO.close();
	}

	public void bubbleSort(List<Cards> values, int n) {
		for (int i = n; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (values.get(j).getNum() > values.get(j + 1).getNum()) {
					values.add(j, values.get(j + 1));
					values.remove(j + 2);
				}
			}
		}
	}

	private void selectionSort(List<Cards> values, int n) {
		for (int i = 0; i < n - 1; i++) {
			Cards minj = values.get(i);
			int minindex = 0;
			for (int j = i; j < n; j++) {
				if (minj.getNum() > values.get(j).getNum()) {
					minj = values.get(j);
					minindex = j;
				}
			}
			if(values.get(i).getNum() > minj.getNum()) {
			values.set(minindex, values.get(i));
			values.set(i, minj);
			}
		}
	}

	private void listConverter(List<String> slist, List<Cards> values) {
		for(int i = 0; i < slist.size(); i++) {
			String suit = slist.get(i).substring(0,1);
			int num = Integer.parseInt(slist.get(i).substring(1, 2));
			values.add(new Cards(suit, num));
		}
	}

	private void checkOrder(List<Cards> values1, List<Cards> values2) {
		for(int i = 0; i < values1.size(); i++) {
			if (!(values1.get(i).toString().equals(values2.get(i).toString()))) {
				System.out.println("Not stable");
				System.exit(0);
			}
		}
		System.out.println("Stable");
	}
}

class Cards {
	private final String suit;
	private final int num;

	public Cards(String suit, int num) {
		super();
		this.suit = suit;
		this.num = num;
	}
	@Override
	public String toString() {
		return suit + "" + num;
	}
	public int getNum() {
		return this.num;
	}
}

class InputOutput {
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
		for (int i = 0; i < n; i++) {
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

	public List<String> getLineString() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<String> ary = Arrays.asList(s);
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

	public <E> void outputLine(List<E> values) {
		StringBuilder line = new StringBuilder();
		for (int k = 0; k < values.size(); k++) {
			line.append(values.get(k) + " ");
		}
		System.out.println(line.delete(line.length() - 1, line.length()));
	}
}