import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

	private static int n;
	private static int p_cnt[];
	private static final int SIZE = 1000000;

	public static void main(String args[]) throws Exception {

		p_cnt = new int[SIZE];
		p_cnt[1] = 0;
		p_cnt[2] = 0;
		for(int i=3;i<SIZE;i = i+2){
			boolean isPnum = true;
			for(int j=3;j<=Math.sqrt(i);j+=2)
			{
				if(i%j==0)
				{
					isPnum = false;
					break;
				}
			}
			if(isPnum){
				p_cnt[i] = p_cnt[i-2]+1;
			}
			else{
				p_cnt[i] = p_cnt[i-2];
			}
			
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null ) {
			n = Integer.parseInt(line);
			
			if(n % 2 == 0 && n > 2){
				System.out.println(p_cnt[n-1]+1);
			}
			else {
				System.out.println(p_cnt[n]+1);
			}
		}
	}
}