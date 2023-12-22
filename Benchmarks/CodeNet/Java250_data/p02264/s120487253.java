import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

	public static void main(String[] args) {
		int n,q;
		int time = 0;

		Input stdIn = new Input();
		List<Integer> firstline = stdIn.getLineInteger();
		n = firstline.get(0);
		q = firstline.get(1);

		Deque<Process> queue = new LinkedList<>();

		for(int i = 0; i < n; i++) {
			List<String> line = stdIn.getLineString();
			String name = line.get(0);
			int t = Integer.parseInt(line.get(1));
			queue.add(Process.createProcess(name, t));
		}

		while(queue.size() > 0) {
			Process temp = queue.pop();
			if(temp.time <= q) {
				time += temp.time;
				System.out.println(temp.name + " " + time);
			} else {
				time += q;
				temp.decTime(q);
				queue.add(temp);
			}
		}
	}
}

class Process {
	String name;
	int time;
	public Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
	public static Process createProcess(String name, int time) {
		Process p = new Process(name, time);
		return p;
	}
	public void decTime(int q) {
		this.time -= q;
	}
}
class Input {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Input() {
		super();
	}

	public Integer getLineValue() {
		try {
			String[] s = br.readLine().trim().split(" ");
			return Integer.parseInt(s[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Integer> getLineInteger() {
		List<Integer> values = new ArrayList<>();
		try {
			String[] s = br.readLine().trim().split(" ");
			for(int i = 0; i < s.length; i++) {
				values.add(Integer.parseInt(s[i]));
			}
			return values;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<String> getLineString() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<String> values = Arrays.asList(s);
			return values;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}