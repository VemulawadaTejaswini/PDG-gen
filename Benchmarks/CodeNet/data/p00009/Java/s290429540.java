import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static int countPrime(int n){
		int cnt = 0
		boolean flag = true;
		if(n <= 1)return cnt;
		if(n == 2){
			cnt++;
			return cnt;
		}
		cnt++;
		for(int i = 3; i <= n; i += 2){
			for(int j = 3; j <= Math.sqrt(i); j += 2){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag)cnt++;
			else flag = true;
		}
		return cnt;
	}

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int cnt = 0;
			int n = scan.nextInt();
			cnt = countPrime(n);
			list.add(cnt);
		}
		for(int n : list){
			System.out.printf("%d\n", n);
		}
	}
}