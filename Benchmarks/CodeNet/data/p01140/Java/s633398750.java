import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] h = new int[1501];
		int[] w = new int[1501];
		HashMap<Integer,Integer> hnum = new HashMap<>();
		HashMap<Integer,Integer> wnum = new HashMap<>();
		
		while(true){
			int N = in.nextInt();
			int M = in.nextInt();
			if(N==0 && M==0) break;
			
			for(int i=1;i<=N;i++){
				h[i] = in.nextInt()+h[i-1];
			}
			for(int i=1;i<=M;i++){
				w[i] = in.nextInt()+w[i-1];
			}
			
			for(int i=1;i<=N;i++){
				for(int j=i;j<=N;j++){
					int trg = h[j]-h[i-1];
					if(hnum.containsKey(trg)){
						hnum.put(trg,hnum.get(trg)+1);
					}else{
						hnum.put(trg,1);
					}
				}
			}
			for(int i=1;i<=M;i++){
				for(int j=i;j<=M;j++){
					int trg = w[j]-w[i-1];
					if(wnum.containsKey(trg)){
						wnum.put(trg,wnum.get(trg)+1);
					}else{
						wnum.put(trg,1);
					}
				}
			}
			
			long ans = 0;
			for(int i=1;i<=1500000;i++){
				if(hnum.containsKey(i)&&wnum.containsKey(i)){
					ans += ((long)hnum.get(i))*wnum.get(i);
				}
			}
			
			System.out.println(ans);
			
			Arrays.fill(h,0);
			Arrays.fill(w,0);
			hnum.clear();
			wnum.clear();
			
		}
		
	}
}