import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, flag, cnt = 0;
		
		List<Integer> cntArray = new ArrayList<>();
		
		while(sc.hasNext()) {
			n = sc.nextInt();
			
			for(int i = 2; i <= n; i++) {
				flag = 0;
				
				if(i % 2 == 0 && i != 2) {
					flag = 1;
				}
				
				for(int j = 3; j <= Math.sqrt(i); j+=2) {
					if(i % j == 0) {
						flag = 1;
						break;
					}
				}
				
				if(flag == 0) {
					cnt++;
				}
			}
			
			cntArray.add(cnt);
		}
		
		for(int i = 0; i < cntArray.size(); i++) {
			System.out.println(cntArray.get(i));
		}
		
	}
}