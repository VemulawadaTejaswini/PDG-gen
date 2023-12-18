import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	static long N;
	static long K;
	static List<Long> P;
	static List<Long> C;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line1 = br.readLine().split(" ");
		P = Arrays.asList(br.readLine().split(" ")).stream().map(p -> Long.parseLong(p)).collect(Collectors.toList());
		C = Arrays.asList(br.readLine().split(" ")).stream().map(c -> Long.parseLong(c)).collect(Collectors.toList());

		N = Long.parseLong(line1[0]);
		K = Long.parseLong(line1[1]);

		/*
		long SUM = 0L;
		long loopTimes = 0L;
		if(N < K) {
			Long sum = C.stream().mapToLong(c -> c).sum();
			if(0 <= sum) {
				SUM = sum;
				loopTimes = K / N;
				K = K % N;
			} else {
				K = N;
			}
		}
		System.out.println("loop="+loopTimes);
		System.out.println("SUM="+SUM);
		System.out.println("K="+K);
		*/

		boolean isInitialized = false;
		long maxCost = 0L;
		/*
		for(int i=0 ; i < (int)N; i++){
			long tempCost = getMaxCost(i);
			if(!isInitialized){
				isInitialized = true;
				maxCost = tempCost;
				continue;
			}
			if(maxCost < tempCost){
				maxCost = tempCost;
			}
		}
		*/
		for(int i=0 ; i < (int)N; i++){
			long tempCost = getMaxCost(i);
			if(!isInitialized){
				isInitialized = true;
				maxCost = tempCost;
				continue;
			}
			if(maxCost < tempCost){
				maxCost = tempCost;
			}
		}

//		maxCost += SUM * loopTimes;
		System.out.println(maxCost);
	}

	public static long getMaxCost(int startIdx){
		long cost = C.get(startIdx);
		int nextIdx = P.get(startIdx).intValue() - 1;
		long maxCost = cost;
		for(int i=0 ; i < (int)K; i++){
			cost += C.get(nextIdx);
			nextIdx = P.get(nextIdx).intValue() - 1;
			if(maxCost < cost){
				maxCost = cost;
			}
		}
		return maxCost;
	}
	public static long move(int i, long cost){
		int nextIdx = P.get(i).intValue();
		return cost + C.get(nextIdx);
	}
}