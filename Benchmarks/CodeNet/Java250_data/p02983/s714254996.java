import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long l=Long.parseLong(scan.next());
		long r=Long.parseLong(scan.next());
		
		if (r-l>=2018) {
			System.out.print(0);
		}else {
			long min=2019;
			for (long i = l;i<r;++i) {
				for (long k=i+1;k<=r;++k) {
					min=Math.min(min, (i*k)%2019);
				}
			}
			System.out.print(min);
		}

}
}
//end