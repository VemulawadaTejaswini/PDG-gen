import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//???????????????????????????
	static final int SPAN_SIZE = 200;
	//????????????????????????
	static List<Integer> spanSizeList = new ArrayList<Integer>();
	static LinkedList<Integer> all = new LinkedList<Integer>();
	//????????????min
	static LinkedList<Integer> minList = new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		{
			int min = Integer.MAX_VALUE;
			for (int i = 1; i <= n; i++) {
				int val = in.nextInt();
				all.add(Integer.valueOf(val));
				min = Math.min(min, val);
				if (i % SPAN_SIZE == 0) {
					spanSizeList.add(SPAN_SIZE);
					minList.add(min);
					min = Integer.MAX_VALUE;
				}
			}
			spanSizeList.add(n % 200);
			minList.add(min);
		}

		for (int i = 0; i < q; i++) {
			int qerry = in.nextInt();
			if (qerry == 0) {
				int l = in.nextInt();
				int r = in.nextInt();
				Integer val = all.remove(r);
				all.add(r, val);
				int[] lArea = getAreaIndex(l);
				int[] rArea = getAreaIndex(r);
				int lAreaIndex = lArea[0];
				int rAreaIndex = rArea[0];
				int lSpan = lArea[2];
				int rSpan = rArea[2];
				if (lAreaIndex != rAreaIndex) {
					spanSizeList.set(lAreaIndex, ++lSpan);
					Integer span = spanSizeList.set(rAreaIndex, --rSpan);
					if (val < minList.get(lAreaIndex)) {
						minList.set(lAreaIndex, val);
					}
					if (val == minList.get(rAreaIndex)) {
						minSet(val, rAreaIndex, rAreaIndex, span);
					}

				}
			} else if (qerry == 1) {
				int l = in.nextInt();
				int r = in.nextInt();
				//				System.out.println(l + ":" + r);
				int[] lArea = getAreaIndex(l);
				int[] rArea = getAreaIndex(r);
				Integer min;
				if (lArea[0] == rArea[0]) {
					min = min(l, r + 1);
				} else {
					Integer lmin = min(l, lArea[1] + lArea[2] + 1);
					Integer rmin = min(rArea[1], r + 1);
					min = Math.min(lmin, rmin);
					int l_spans_r = rArea[0] - lArea[0] - 1;
					if (l_spans_r > 0) {
						List<Integer> subList = minList.subList(lArea[0] + 1, rArea[0]);
						for (Integer newMin : subList) {
							if (newMin.compareTo(min) < 0) {
								min = newMin;
							}
						}
					}
				}
				System.out.println(min);

			} else {
				int pos = in.nextInt();
				Integer val = Integer.valueOf(in.nextInt());
				Integer pre = all.set(pos, val);
				if (pre > val) {
					int[] posiInfo = getAreaIndex(pos);
					minSet(val, posiInfo[0], posiInfo[1], posiInfo[2]);
				}
			}
		}

	}

	private static Integer min(int from, int to) {
		Integer min = Integer.MAX_VALUE;
		List<Integer> subList = all.subList(from, to);
		//		System.out.println(subList);
		for (Integer newMin : subList) {
			if (min.compareTo(newMin) > 0) {
				min = newMin;
			}
		}
		return min;
	}

	/**???????????????Index???????????¨?????¢????????±?????????*/
	static int[] getAreaIndex(int posi) {
		int start = 0;
		for (int aIndex = 0;; aIndex++) {
			int size = spanSizeList.get(aIndex);
			if (start <= posi && posi < start + size) {
				return new int[] { aIndex, start, size };
			}
			start += size;
		}

	}

	static void minSet(Integer val, int areaIndex, int startIndex, Integer span) {
		int newMin = val;
		List<Integer> subList = all.subList(startIndex, startIndex + span);
		for (int v : subList) {
			newMin = Math.min(v, newMin);
		}
		minList.set(areaIndex, newMin);
	}
}