import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> sumArray = new ArrayList<>();
		
		while(true) {
			String x = sc.next();
			
			if(x.equals("0")) {
				break;
			}
			
			int sum = 0;
			
			for(int i = 0; i < x.length(); i++) {
				sum+=Integer.parseInt(x.substring(i, i + 1));
			}
			
			sumArray.add(sum);
		}
		
		for(int i = 0; i < sumArray.size(); i++) {
			System.out.println(sumArray.get(i));
		}
	}
}