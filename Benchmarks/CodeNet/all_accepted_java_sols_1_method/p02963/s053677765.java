import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		// System.out.prlongln(S);
		long x1 =0;
		int x2 =1000000000;
		long x3 =(x2-S%x2)%x2;
		long y1 =0;
		long y2 =1;
		long y3 =((S-1)/x2+1);
		// System.out.println(S % 2);

		// y2 = S / x1;
		// if (y2 == 0){
		// 	y2 = 1;
		// }
		// y1 = (x1 * (int)y2) - S;
		// System.out.println(y1);
		// System.out.println(y2);
		System.out.println(x1 + " " + y1 + " " + x2 + " " + (int)y2 + " " + x3 + " " + y3);

	}
}

// import java.util.*;
// public class Main{
// 	public static void main(String[]i){
// 		long s=Long.parseLong(new Scanner(System.in).next());
// 		int a=1000000000;
// 		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
// 	}
// }
