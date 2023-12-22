import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = sc.nextLong();

		List<Long> timeList = Arrays.asList(A, B, C, D, E);
		long minTime = timeList.stream()
                .min((a, b) -> a.compareTo(b)).get();
		int minIndex = timeList.indexOf(minTime);


		long time = N/minTime;
		if(N%minTime != 0){
			time++;
		}

		time += 5- (minIndex+1) + minIndex;

		System.out.println(time);


	}


}
