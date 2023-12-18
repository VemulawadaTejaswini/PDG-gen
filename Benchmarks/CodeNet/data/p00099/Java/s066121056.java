import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			final String[] datasize = input.readLine().split(" ");
			final int personCount = Integer.parseInt(datasize[0]);
			final int eventCount = Integer.parseInt(datasize[1]);

			int[] sumArray = new int[personCount + 1];
			Arrays.fill(sumArray, 0);
			while (input.ready()) {
				final String[] event = input.readLine().split(" ");
				final int personNum = Integer.parseInt(event[0]);
				final int eventNum = Integer.parseInt(event[1]);
				sumArray[personNum] += eventNum;
				int[] ans = getMaxPersonData(sumArray);

				System.out.println(ans[0] + " " + ans[1]);
			}
		}
	}

	public static int[] getMaxPersonData(int[] array) {
		ArrayList<FishingContest> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(new FishingContest(i, array[i]));
		}
		FishingContest max = Collections.max(list, new FishingContestComparator());
		int[] ret = { max.getPersonNum(), max.getFishCount() };
		return ret;
	}

	static class FishingContest {
		private int personNum;
		private int fishCount;

		public FishingContest(int personNum) {
			this.personNum = personNum;
			this.fishCount = 0;
		}

		public FishingContest(int personNum, int eventCount) {
			this.personNum = personNum;
			this.fishCount = eventCount;
		}

		public void catchFish(int count) {
			this.fishCount += count;
		}

		public int getPersonNum() {
			return this.personNum;
		}

		public int getFishCount() {
			return this.fishCount;
		}
	}

	static class FishingContestComparator implements Comparator<FishingContest> {

		@Override
		public int compare(FishingContest o1, FishingContest o2) {
			final int o1_count = o1.getFishCount();
			final int o2_count = o2.getFishCount();

			if (o1_count > o2_count) {
				return 1;
			} else if (o1_count == o2_count) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}