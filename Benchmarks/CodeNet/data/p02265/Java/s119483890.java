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
		List<Integer> ary = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println(ary);
			List<String> inputline = stdIO.getLineString();
			String command = inputline.get(0);
			int value = 0;
			if (inputline.size() == 2) {
				value = Integer.parseInt(inputline.get(1));
			}
			System.out.println("command: " + command + " value: " + value);
			switch (command) {
			case "insert":
				insert(ary, value);
				break;
			case "delete":
				delete(ary, value);
				break;
			case "deleteFirst":
				deleteFirst(ary);
				break;
			case "deleteLast":
				deleteLast(ary);
				break;
			}
		}
		stdIO.outputLine(ary);
		stdIO.close();
	}

	private static void insert(List<Integer> ary, int value) {
		ary.add(0, value);
	}

	private static void delete(List<Integer> ary, int value) {
		ary.remove((Integer) value);
	}

	private static void deleteFirst(List<Integer> ary) {
		ary.remove(0);
	}

	private static void deleteLast(List<Integer> ary) {
		ary.remove(ary.size()-1);
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
	public <E> void outputLines(List<E> values) {
		for (E e : values) {
			System.out.println(e);
		}
	}
}