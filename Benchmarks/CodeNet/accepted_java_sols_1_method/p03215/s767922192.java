import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int[] nk = new int[2];
	static int[] a; 
	static List<Long> sel = new ArrayList<>();
	
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			a = new int[nk[0]];
			a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
		}
		
		long max = 0;
		for (int i=0; i<nk[0]; i++) {
			long tmp = 0;
			for (int j=i; j<nk[0]; j++) {
				tmp += a[j];
				sel.add(tmp);
				if(tmp > max) max = tmp;
			}
		}

		long rst = 0;
		
		for(long i=40; i>=0; i--) {
			int cnt = 0;
			long y = 1L << i;
			for (Long l : sel) {
				if((l & y) > 0) cnt++;
				if(cnt == nk[1]) {
					rst |= y;
					sel.removeIf(n -> (n & y) == 0);
					break;
				}
			}
		}
		
		System.out.println(rst);
	}
}
