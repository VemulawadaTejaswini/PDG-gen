import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char array[] = br.readLine().toCharArray();
		int area = 0,sum = 0,j;
		Deque<Integer> stack1 = new ArrayDeque<>();
		Deque<Data> stack2 = new ArrayDeque<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '\\') {
				stack1.push(i);
			} else if (array[i] == '/') {
				if (!stack1.isEmpty()) {
					j = stack1.pop();
					area = i - j;
					sum += area;
					while (!stack2.isEmpty() && stack2.peek().index > j) {
						area += stack2.pop().area;
					}
					stack2.push(new Data(j, area));
				}
			}
		}
		System.out.println(sum);
		System.out.print(stack2.size());
		while (!stack2.isEmpty()) {
			System.out.print(" " + stack2.pollLast().area);
		}
		System.out.println();
	}
}

class Data {
	int index, area;

	Data(int index, int area) {
		this.index = index;
		this.area = area;
	}
}
