
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		int N = s.length();
		int M = 2019;
		Integer[] DP = new Integer[N+1];
		Arrays.fill(DP, 0);
		int ten = 1;
		DP[N-1] = Character.getNumericValue(s.charAt(N-1));
		for(int i=N-1;i>=0;i--) {
			DP[i] = (DP[i+1]+Character.getNumericValue(s.charAt(i))*ten)%M;
			ten = (ten*10)%M;
		}
		
		List<Integer> list = Arrays.asList(DP);
		
		Map<Integer, Long> counts = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Long value : counts.values()) {
			ans+=value*(value-1)/2;
		}
		
        System.out.println(ans);
        

	}
	
	
	
}


