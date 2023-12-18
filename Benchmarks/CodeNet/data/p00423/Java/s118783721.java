import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> resultListA = new ArrayList<Integer>();
		List<Integer> resultListB = new ArrayList<Integer>();
		int resultCount = 0;
		while (true) {
			int n = Integer.parseInt(sc.nextLine());			
			if (n == 0) {
				break;
			}
			
			int aPoint = 0;
			int bPoint = 0;
			for (int i = 0; i < n; i++) {
				String[] input = sc.nextLine().split(" ");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				
				if (a > b) {
					aPoint += (a + b);
				} else if (a < b) {
					bPoint += (a + b);
				} else {
					aPoint += a;
					bPoint += b;
				}
			}
			resultListA.add(aPoint);
			resultListB.add(bPoint);
			resultCount++;
		}
		
		for (int j = 0; j < resultCount; j++) {
			System.out.println(resultListA.get(j) + " " + resultListB.get(j));	
		}
	}
}