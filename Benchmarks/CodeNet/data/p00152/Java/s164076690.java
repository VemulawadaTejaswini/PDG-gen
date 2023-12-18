import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static class Result implements Comparable<Result>{
		int number, score;

		public Result(int number, int score) {
			super();
			this.number = number;
			this.score = score;
		}

		@Override
		public int compareTo(Result o) {
			if(this.score != o.score){
				return o.score - this.score;
			}else{
				return this.number - o.number;
			}
		}
		
		public String toString(){
			return this.number + " " + this.score;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			final int m = sc.nextInt();

			if (m == 0) {
				break;
			}
			
			ArrayList<Result> result = new ArrayList<Result>();

			for (int tt = 0; tt < m; tt++) {
				boolean[] is_strike = new boolean[10];
				boolean[] is_spare = new boolean[10];
				int[] count_score = new int[21];
				int[] frame_score = new int[10];
				int[] sum_score = new int[10];
				
				final int number = sc.nextInt();

				for (int frame = 0; frame < 10; frame++) {
					if (frame != 9) {
						final int score_1 = sc.nextInt();
						count_score[frame * 2] = score_1;

						if (score_1 == 10) {
							is_strike[frame] = true;
							frame_score[frame] = score_1;
							continue;
						}

						final int score_2 = sc.nextInt();
						count_score[frame * 2 + 1] = score_2;

						if (score_1 + score_2 == 10) {
							is_spare[frame] = true;
						}
						
						frame_score[frame] = score_1 + score_2;
					} else {
						final int score_1 = sc.nextInt();
						count_score[frame * 2] = score_1;

						final int score_2 = sc.nextInt();
						count_score[frame * 2 + 1] = score_2;

						if (score_1 == 10 || score_1 + score_2 == 10) {
							final int score_3 = sc.nextInt();
							count_score[frame * 2 + 2] = score_3;
							frame_score[frame] = score_1 + score_2 + score_3;
						} else {
							frame_score[frame] = score_1 + score_2;
						}
					}
				}
				
				//System.out.println(Arrays.toString(count_score));
				
				for (int frame = 0; frame < 10; frame++) {
					sum_score[frame] = (frame == 0 ? 0 : sum_score[frame - 1]) + frame_score[frame];
					
					if (is_spare[frame] || is_strike[frame]) {
						sum_score[frame] += count_score[(frame + 1) * 2];

						if (is_strike[frame]) {
							if (is_strike[frame + 1]) {
								sum_score[frame] += count_score[(frame + 2) * 2];
							} else {
								sum_score[frame] += count_score[(frame + 1) * 2 + 1];
							}
						}
					}
				}
				
				//System.out.println(Arrays.toString(sum_score));
				
				result.add(new Result(number, sum_score[9]));
			}
			
			
			
			Collections.sort(result);
			
			for(Result res : result){
				System.out.println(res);
			}
		}

	}
}