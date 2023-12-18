import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long x1 =0;
		int x2 =1000000000;
		long x3 =(x2-S%x2)%x2;
		long y1 =0;
		long y2 =1;
		long y3 =((S-y2)/x2+y2);
		System.out.println(x1 + " " + y1 + " " + x2 + " " + (int)y2 + " " + x3 + " " + y3);

	}
}