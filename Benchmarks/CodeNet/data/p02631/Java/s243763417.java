import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			XorData xorData = new XorData();
			int cnt = scn.nextInt();

			for(int i=0; i<cnt; i++) {
				xorData.add(scn.nextInt());
			}

			StringBuilder sb = new StringBuilder();
			IntStream.range(0, cnt).forEach(idx -> {
				if(0 < idx) {
					sb.append(' ');
				}
				sb.append(xorData.getOriginal(idx));
			});
			System.out.println(sb.toString());
		}
		/*
		XorData xorData = new XorData();
		IntStream.of(20, 11, 9, 24).forEach(xorData::add);
		IntStream.rangeClosed(0, 3).forEach(idx -> System.out.println(xorData.getOriginal(idx)));
		*/
	}

	public static class XorData {
		List<Integer> list = new ArrayList<>();

		int xorInt = 0;

		public int add(int xorNum) {
			list.add(xorNum);
			xorInt ^= xorNum;
			return xorInt;
		}

		public int getOriginal(int index) {
			return (xorInt ^ list.get(index));
		}
	}
}
