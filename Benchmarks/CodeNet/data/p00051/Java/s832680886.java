import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			long temp = in.nextLong();
			List<Integer> number = new ArrayList<Integer>();
			while(temp > 0) {
				number.add((int) (temp % 10));
				temp /= 10;
			}
			Collections.sort(number);
			long min = number.get(0);
			for(int j=1; j<number.size(); j++) {
				min = min*10 + number.get(j);
			}
			long max = number.get(number.size()-1);
			for(int j=number.size()-2; j>=0; j--) {
				max = max*10 + number.get(j);
			}
			System.out.println(max-min);
		}
		
	}
}