import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		for(int i=1;i<=N;i++) {
			
			//111 -> 11 -> 1 -> 0
			int cnt = 0;
			
			int tmp = i;
			
			while(tmp != 0) {
				tmp/=10; // i = i / 10 ;  i = i + 3 -> i+=3; i = i+1 -> i++
				cnt ++;
			}
			
			if(cnt % 2 == 1) count ++;
			
		}
		System.out.println(count);
	}
	
}