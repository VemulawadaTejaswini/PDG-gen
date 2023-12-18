
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		List<Range> ranges = new ArrayList<>();
		IntStream.range(0, n).forEach(i -> ranges.add(new Range(stdIn.nextInt(), stdIn.nextInt())));

		stdIn.close();

		if(ranges.size() % 2 == 1) {
			ranges.sort(Comparator.comparing(Range::getA));
			int min = ranges.get(ranges.size()/2).getA();

			ranges.sort(Comparator.comparing(Range::getB).reversed());
			int max = ranges.get(ranges.size()/2).getB();

			System.out.println(max - min + 1);
			return;
		}

		ranges.sort(Comparator.comparing(Range::getA));
		int minN = ranges.get((ranges.size()-1)/2).getA();
		int minN1 = ranges.get((ranges.size()-1)/2 + 1).getA();

		ranges.sort(Comparator.comparing(Range::getB).reversed());
		int maxN = ranges.get((ranges.size()-1)/2).getB();
		int maxN1 = ranges.get((ranges.size()-1)/2 + 1).getB();

//
//		int nCnt = maxN - minN + 1;
//		int n1Cnt = maxN1 - minN1 + 1;
//
//		int dupl = Integer.max(0, maxN - minN1 + 1);

		System.out.println(maxN+maxN1-minN-minN1+1);

	}
}

class Range {
	private int a;
	private int b;


	public Range(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

	public int getRange() {
		return a + b - 1;
	}

	@Override
	public String toString() {
		return "Range [a=" + a + ", b=" + b + "]";
	}


}