import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int K = sn.nextInt();
		char[] D = new char[10];
		for(int i = 0; i < K; ++i) D[i] = (char)('0' + sn.nextInt());
		
		int ans = N;
		while(ans < 10000000){
			String pay = String.valueOf(ans);
			boolean flag = true;
			for(int i = 0; i < pay.length(); ++i){
				for(int j = 0; j < K; ++j){
					if(pay.charAt(i) == D[j]){
						flag = false;
						break;
					}
				}
				if(!flag) break;
			}
			if(flag) break;
			++ans;
		}
		System.out.println(ans);
	}
}
