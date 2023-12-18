import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int length = reader.nextInt(), moves = reader.nextInt();
		long[] p = new long[length], c = new long[length];
		for (int i = 0; i < length; i++) {
			p[i] = reader.nextLong();
		}
		for (int i = 0; i < length; i++) {
			c[i] = reader.nextLong();
		}
		long maxScore = Long.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			long score = 0, next = i + 1, movesLeft = moves, second = 0, cycle = 0;
			while (movesLeft > 0) {
				cycle++;
				score += c[(int) p[(int) next - 1] - 1];
				maxScore = Math.max(maxScore, score);
				next = p[(int) next - 1];
				movesLeft--;
				if (next == i) {
					second++;
					if (second == 2) {
						break;
					}
				}
			}
			if (movesLeft > 0) {
				next = 1;
				score *= movesLeft / cycle;
				maxScore = Math.max(maxScore, score);
				movesLeft %= cycle;
				while (movesLeft > 0) {
					score += c[(int) p[(int) next]];
					maxScore = Math.max(maxScore, score);
					next = p[(int) next];
					movesLeft--;
				}
				//arr[i] = score;
			}
		}
//		long max = Integer.MIN_VALUE;
//		System.out.print("ARR: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			max = Math.max(max, (int) arr[i]);
//		}
//		System.out.println();
		System.out.println(maxScore);
		
		reader.close();
	}
	
}
