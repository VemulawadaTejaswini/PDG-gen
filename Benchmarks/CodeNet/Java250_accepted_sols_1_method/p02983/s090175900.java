import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(System.in);
		int l = parseInt(sc.next());
		int r = parseInt(sc.next());
		sc.close();
		long a;
		int l2019 = l / 2019;
		int r2019 = r / 2019;
		if(l2019!=r2019)  {
			System.out.println(0);
		} else {
			long min1 = 2000000000;
			for(i=l;i<r;i++) {
				for(j=i+1;j<=r;j++) {
					a = i*j % 2019;
					if(a < min1) {
						min1 = a;
					}
				}
			}
			System.out.println(min1);
		}
	}
}
