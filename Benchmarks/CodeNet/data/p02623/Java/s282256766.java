
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static class Temp {
		int first;
		int second;

		public Temp(int one, int two) {
			this.first = one;
			this.second = two;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + second;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Temp other = (Temp) obj;
			if (first != other.first)
				return false;
			if (second != other.second)
				return false;
			return true;
		}

	}

	static HashMap<Temp, Integer> map = new HashMap<Temp, Integer>();

	public static int maxBooks(int first[], int second[], int firstPointer, int secondPointer, int time, int count) {
		if (time == 0) {
			return count;
		}
		Temp t = new Temp(firstPointer, secondPointer);
		if (map.containsKey(t)) {
			return map.get(t);
		}
		int resultOne = count;
		if (firstPointer < first.length && time - first[firstPointer] >= 0) {
			resultOne = maxBooks(first, second, firstPointer + 1, secondPointer, time - first[firstPointer], count + 1);
		}
		int resultTwo = count;
		if (secondPointer < second.length && time - second[secondPointer] >= 0) {
			resultTwo = maxBooks(first, second, firstPointer, secondPointer + 1, time - second[secondPointer],
					count + 1);
		}
		map.put(t, Math.max(resultOne, resultTwo));
		return Math.max(resultOne, resultTwo);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = null;
		int n, m, k;
		map.clear();
		line = br.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		m = Integer.parseInt(line[1]);
		k = Integer.parseInt(line[2]);
		int first[] = new int[n];
		int second[] = new int[m];
		line = br.readLine().split(" ");
		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(line[i]);
		}
		line = br.readLine().split(" ");
		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(line[i]);
		}
		System.out.println(maxBooks(first, second, 0, 0, k, 0));

	}

}
