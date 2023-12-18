import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int ans = 1;
		for(long i = 0; i < k; i++){
			int tmp = Integer.parseInt(s.substring((int)i,(int)i+1));
			if(tmp != 1){
				ans = tmp;
				break;
			}
		}
		System.out.print(ans);
	}
}
