import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		Deque<Integer> que = new ArrayDeque<>();
		Deque<List<Integer>> puddle = new ArrayDeque<>();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("\\")) {
				que.add(i);
			} else if(str[i].equals("/")) {
				if (que.size() == 0) {
					continue;
				} else {
					int l = que.pollLast();
					int s = i - l;
					if(puddle.size() == 0) {
						puddle.addLast(new ArrayList<>());
						puddle.getLast().add(0, l);
						puddle.getLast().add(1, s);
					} else {
						if(l > puddle.getLast().get(0)) {
							puddle.addLast(new ArrayList<>());
							puddle.getLast().add(0, l);
							puddle.getLast().add(1, s);
						} else {
							List<Integer> list = puddle.pollLast();
							while (true) {
								s += list.get(1);
								if (puddle.size() == 0) {
									break;
								} else if(puddle.getLast().get(0) < l) {
									break;
								} else {
									list = puddle.pollLast();
								}
							}
							puddle.add(new ArrayList<>());
							puddle.getLast().add(0, l);
							puddle.getLast().add(1, s);
						}
					}
				}
			}
		}
		int sum = 0;
		Iterator<List<Integer>> it = puddle.iterator();
		while (it.hasNext()) {
			List<Integer> next = it.next();
			sum += next.get(1);
		}
		System.out.println(sum);
		if (puddle.size() == 0) {
			System.out.print(puddle.size());
		} else {
			System.out.print(puddle.size() + " ");
			it = puddle.iterator();
			while (it.hasNext()) {
				List<Integer> next = it.next();
				if(!it.hasNext()) {
					System.out.println(next.get(1));
				} else {
					System.out.print(next.get(1) + " ");
				}
			}
		}
	}
}
