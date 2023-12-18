import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			BitSet[] sche = new BitSet[30];
			for(int i=0; i<30; i++){
				sche[i] = new BitSet(n);
			}
			long[] map = new long[n];
			for(int i=0; i<n; i++){
				map[i] = 1<<i;
				int f = in.nextInt();
				for(int j=0; j<f; j++){
					int day = in.nextInt();
					sche[day-1].set(i);
				}
			}
			long all = (1<<n)-1;
			int res = -1;
			out: for(int i=0; i<30; i++){
				for(int j=sche[i].nextSetBit(0); j!=-1; j=sche[i].nextSetBit(j+1)){
					for(int k=sche[i].nextSetBit(0); k!=-1; k=sche[i].nextSetBit(k+1)){
						if(j == k) continue;
						map[j] |= map[k];
					}
					if(map[j] == all){
						res = i+1;
						break out;
					}
				}
			}
			System.out.println(res);
		}
	}
}