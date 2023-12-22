import java.util.Scanner;
public class Main{
	
	static int count(int a) {
		/*int cnt = 0;
		while(a==0) {
			cnt++;
			a/=10;
		}
		return cnt;
		*/
		
		String aa = String.valueOf(a);
		
		if(aa.length()==1) {
			return Integer.parseInt(aa);
			
			
			
		}else {
			int cnt = 0;
			
			for(int i = 0; i < aa.length(); i++) {
				int aaa = Integer.parseInt(aa.substring(i,i+1));
				cnt += aaa;
			}
			return cnt;
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		long cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			if(count(i)>= a && count(i) <= b ) {
				cnt+=i;
			}
		}
		System.out.println(cnt);
		
	}

}
