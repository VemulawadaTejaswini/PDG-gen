import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextInt();
		long m = sc.nextInt();
		List<Long> list = new ArrayList<Long>(); 
		boolean exist = false;
		long now = x;
		int loopst = 0;
		int loopfin = 0;
		long limit = 0;
		while(!exist&&limit<n) {
			if(list.contains(now)) {
				//ループの始まりと終わりのインデックス
				loopst = list.indexOf(now);
				loopfin = list.size()-1;
				exist = true;
			}
			else list.add(now);
			now = ((now%m)*(now%m))%m;
			limit++;
		}
		//System.out.println(loopst);
		//System.out.println(loopfin);
		if(loopst==0&&loopfin==0) {
			long ans = 0;
			for(int i = 0; i < list.size(); i++) {
				ans+=list.get(i);
			}
			System.out.println(ans);
		}
		else {
			//ループしている数字の個数
			long loopnum = loopfin - loopst + 1;
			//ループの回数
			long loop = (n-loopst)/loopnum;
			//ループの余った分
			long loopmod = (n-loopst)%loopnum;
			//ループ内のA_nの和
			long sumloop = 0;
			for(int i = loopst; i <= loopfin; i++) {
				sumloop+=list.get(i);
			}
			sumloop*=loop;
			//ループが始まる前の和
			long sumbef = 0;
			for(int i = 0; i < loopst; i++) {
				sumbef+=list.get(i);
			}
			//ループのあまり分の和
			long summod = 0;
			for(int i = 0; i < loopmod; i++) {
				summod+=list.get(loopst+i);
			}
			long ans = sumbef + sumloop+ summod;
			System.out.println(ans);
		}
		
	}
}