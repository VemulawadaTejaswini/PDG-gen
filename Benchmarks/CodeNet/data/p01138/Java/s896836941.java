import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static final Pattern pt = Pattern.compile("0?(\\d+):0?(\\d+):0?(\\d+)");
	static final Matcher mc = pt.matcher("");
	private static Comparator<Train> insort = new Comparator<Train>() {
		@Override
		public int compare(Train o1, Train o2) {
			return o1.t2 - o2.t2;
		}
	};
	private static final Comparator<Train> outsort = new Comparator<Train>() {
		@Override
		public int compare(Train o1, Train o2) {
			return o1.t1 - o2.t1;
		}
	};

	public static void main(String[] arg) {
		final Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			Train[] trains = new Train[n];
			for (int i = 0; i < n; i++) {
				trains[i] = new Train(getTime(in), getTime(in));
			}
			Arrays.sort(trains, outsort);
			int time = 0;
			int stock = 0;
			int count = 0;
			LinkedList<Train> moveset = new LinkedList<Train>();
			for (Train t : trains) {
				time = t.t1;
				while (!moveset.isEmpty() && moveset.getFirst().t2 <= time) {
					stock++;
					moveset.removeFirst();
				}
				if (stock == 0) {
					stock++;
					count++;
				}
				moveset.add(t);
				Collections.sort(moveset, insort);
				stock--;
			}
			System.out.println(count);

		}
		in.close();
	}

	private static int getTime(Scanner in) {
		int time;
		mc.reset(in.next());
		mc.matches();
		time = Integer.parseInt(mc.group(3));
		time += Integer.parseInt(mc.group(2)) * 60;
		time += Integer.parseInt(mc.group(1)) * 3600;
		return time;
	}
}

class Train {
	final int t1, t2;

	Train(int t1, int t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + t1;
		result = prime * result + t2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Train other = (Train) obj;
		return (t1 != other.t1) && (t2 != other.t2);
	}
}