import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[] person = new int[N];
		int[] frames = new int[N];
		int[] team = new int[N];
		long[] xs = new long[N];
		long[] ys = new long[N];
		
		for(int i = 0; i < N; i++){
			frames[i] = sc.nextInt();
			person[i] = sc.nextInt();
			team[i] = sc.nextInt();
			xs[i] = sc.nextLong();
			ys[i] = sc.nextLong();
		}
		
		long[] max_dists = new long[]{-1, -1};
		long[] max_frames = new long[]{-1, -1};
		
		for(int i = 0; i < N - 1; i++){
			if(team[i] != team[i + 1]){ continue; }
			if(person[i] == person[i + 1]){ continue; }
			
			final long dist = (xs[i] - xs[i + 1]) * (xs[i] - xs[i + 1]) + (ys[i] - ys[i + 1]) * (ys[i] - ys[i + 1]);
			final long frame = frames[i + 1] - frames[i];
			
			if((max_dists[team[i]] == -1l) || (max_dists[team[i]] < dist) || (max_dists[team[i]] == dist && max_frames[team[i]] > frame)){
				max_dists[team[i]] = dist;
				max_frames[team[i]] = frame;
			}
		}
		
		for(int i = 0; i <= 1; i++){
			if(max_dists[i] == -1){
				System.out.println("-1 -1");
			}else{
				System.out.printf("%.8f %.8f\n", Math.sqrt(max_dists[i]), max_frames[i] / 60.0f);
			}
		}
		
	}
	
} 