import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BitSet gdp = gdp(300000);
		while(true){
			int n = in.nextInt();
			if(n == 1) return;
			StringBuilder sb = new StringBuilder();
			sb.append(n+": ");
			for(int i=gdp.nextSetBit(0); i!=-1 && i<=n; i=gdp.nextSetBit(i+1)){
				if(n%i==0) sb.append(i+" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
	
	public static BitSet gdp(int max){
		BitSet gdn = new BitSet(max+1);
		for(int i=1; i<=max; i++){
			int mod = i%7;
			if(mod == 6 || mod == 1) gdn.set(i);
		}
		BitSet gdp = (BitSet)gdn.clone();
		gdp.clear(1);
		for(int i=gdn.nextSetBit(2); i!=-1; i=gdn.nextSetBit(i+1)){
			for(long j=gdn.nextSetBit(2); j!=-1 && j*i<=max; j=gdn.nextSetBit((int)j+1)){
				gdp.clear((int)j*i);
			}
		}
		return gdp;
	}
}