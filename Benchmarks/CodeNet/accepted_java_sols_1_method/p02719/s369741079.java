import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long N=scan.nextLong();
		long K=scan.nextLong();
		
		
		
	
		if(N==0||N%K==0) {
			System.out.println("0");
		}
		else {
			List<Long> list=new ArrayList<Long>();
			boolean flag=false,flagb=false;
			if(N>K)N=N%K;
			for(;;) {
				long A=Math.abs(N-K);
				
				N=A;
				if(A==1) {
					flag=true;
					flagb=true;
				}
				for(Long i:list) {
					if(i==A)flag=true;
				}
				if(flag)break;
				list.add(A);
			}
			if(flagb) {
				System.out.println("1");
			}
			else {
				long min=list.get(0);
				for(Long i:list) {
					if(min>i)min=i;
				}
				System.out.println(min);
			}
		}

	}

}
