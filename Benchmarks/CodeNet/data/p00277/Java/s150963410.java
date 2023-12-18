import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * 0282 Programming Contest
 */
public class Main {

	public static void main(String[] args) throws IOException {

		// Read contest basic info
		Contest contest = readContest();

		// Read record and count up time
		contest.start();

		// Show result
		System.out.println(contest.getWinner());
	}

	// Read contest basic info
	private static Contest readContest() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] splitted = reader.readLine().split(" ");
		int[] converted = convertStringToInt(splitted);
		return new Contest(converted[0], converted[1], converted[2], reader);
	}

	// Convert string array to int array
	private static int[] convertStringToInt(String[] str) {
		int[] converted = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			converted[i] = Integer.parseInt(str[i]);
		}
		return converted;
	}

	// Get max index
	private static int getMaxIndexLong(Map<Integer, Long> target) {
		if (target.size() == 0) {
			return 1;
		}
		int index = target.keySet().iterator().next();
		long max = target.values().iterator().next();
		for (Map.Entry<Integer, Long> entry : target.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				index = entry.getKey();
			}
		}
		return index;
	}

	// Get max index
	private static int getMaxIndexInt(Map<Integer, Integer> target) {
		if (target.size() == 0) {
			return 1;
		}
		int index = target.keySet().iterator().next();
		int max = target.values().iterator().next();
		for (Map.Entry<Integer, Integer> entry : target.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				index = entry.getKey();
			}
		}
		return index;
	}

	// Contest
	private static class Contest {
		private static final int TEAM_NO = 0;
		private static final int TIME = 1;
		private static final int SCORE = 2;

		private int teamNo;
		private int recordNo;
		private int endTime;
		private BufferedReader reader;
		private int winner;

		// Constructor
		public Contest(int teamNo, int recordNo, int time, BufferedReader reader) {
			this.teamNo = teamNo;
			this.recordNo = recordNo;
			this.endTime = time;
			this.reader = reader;
		}

		// Start contest
		public void start() throws IOException {
			int timer = 0;
			int currentTeam = 1;
			Map<Integer, Long> teamScoreMap = new TreeMap<>();
			Map<Integer, Integer> teamShowTimeMap = new TreeMap<>();

			for (int i = 0; i < recordNo; i++) {
				int[] record = convertStringToInt(reader.readLine().split(" "));

				// Reduce high cost process, for test case #7
				if (record[TIME] != timer) {
					// Select show team
					currentTeam = getMaxIndexLong(teamScoreMap);
				}
				// Add show time
				int showTime = record[TIME] - timer;
				int currentShowTime = (teamShowTimeMap.get(currentTeam) == null) ? 0 : teamShowTimeMap.get(currentTeam);
				teamShowTimeMap.put(currentTeam, currentShowTime + showTime);

				// Update score
				long currentScore = (teamScoreMap.get(record[TEAM_NO]) == null) ? 0 : teamScoreMap.get(record[TEAM_NO]);
				teamScoreMap.put(record[TEAM_NO], currentScore + record[SCORE]);

				// Update currentTime
				timer = record[TIME];

				// Debug
				/*
				System.out.println("Record: " + i);
				System.out.print("teamScore: ");
				teamScoreMap.forEach((team, score) -> System.out.print(score + ", "));
				System.out.println();
				System.out.print("teamShowTime: ");
				teamShowTimeMap.forEach((team, time) -> System.out.print(time + ", "));
				System.out.println();
				System.out.println();
				*/
			}

			// Finally add show time to end of contest
			currentTeam = getMaxIndexLong(teamScoreMap);
			int showTime = endTime - timer;
			int currentShowTime = (teamShowTimeMap.get(currentTeam) == null) ? 0 : teamShowTimeMap.get(currentTeam);
			teamShowTimeMap.put(currentTeam, currentShowTime + showTime);

			// Debug
			/*
			System.out.println("Finish.");
			System.out.print("teamScore: ");
			teamScoreMap.forEach((team, score) -> System.out.print(score + ", "));
			System.out.println();
			System.out.print("teamShowTime: ");
			teamShowTimeMap.forEach((team, time) -> System.out.print(time + ", "));
			System.out.println();
			System.out.println();
			*/

			// Decide winner
			winner = getMaxIndexInt(teamShowTimeMap);
		}

		// Get winner
		public int getWinner() {
			return winner;
		}
	}

}