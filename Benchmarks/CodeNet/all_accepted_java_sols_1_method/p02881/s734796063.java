
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N =sc.nextLong();
		
		double tmp = Math.sqrt(N);
		long tmp2 = (long)tmp;//少数切り捨て
		long tmp3=0;
		boolean flg =true;
		while(flg) {
			if(N%tmp2==0) {
				tmp3 = N/tmp2;
				flg=false;
			}else {
				tmp2--;
			}
		}
		long ans = (tmp2-1)+(tmp3-1);
		System.out.println(ans);

	}
}
