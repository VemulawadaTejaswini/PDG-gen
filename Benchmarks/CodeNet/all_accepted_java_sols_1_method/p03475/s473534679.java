import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numStations = Integer.parseInt(scanner.nextLine());
		int[] time2Next = new int[numStations];
		int[] startTime = new int[numStations];
		int[] frequency = new int[numStations];
		int[] time2Last = new int[numStations];

		for (int sIdx = 0; sIdx < numStations - 1; sIdx++) {
			String[] inputs = scanner.nextLine().split(" ");
			time2Next[sIdx] = Integer.parseInt(inputs[0]);
			time2Last[sIdx] = startTime[sIdx] = Integer.parseInt(inputs[1]);
			frequency[sIdx] = Integer.parseInt(inputs[2]);

			for (int fsIdx = 0; fsIdx <= sIdx; fsIdx++) {
				time2Last[fsIdx] = ((time2Last[fsIdx] - 1) / frequency[sIdx] + 1) * frequency[sIdx] + time2Next[sIdx];
				if (time2Last[fsIdx] < startTime[sIdx] + time2Next[sIdx]) time2Last[fsIdx] = startTime[sIdx] + time2Next[sIdx];
			}
		}

		for (int sIdx = 0; sIdx < numStations; sIdx++) {
			System.out.println(time2Last[sIdx]);
		}
	}
}
