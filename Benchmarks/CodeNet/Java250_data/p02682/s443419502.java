//package Beg_167;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String p = t.nextLine();
		String[] l = p.split(" ");
		long [] list=new long[4];
		for (int i=0;i<l.length;i++) {
			list[i]=Long.parseLong(l[i]);
			
		}
		long a = list[0];
		long b=list[1];
		long c=list[2];
		long k=list[3];
		
		if (a>=k) {
			System.out.println(k);
		}
		else if ((a+b)>k) {
			System.out.println(a);
		}
		else {
			long q = k-a-b;
			System.out.println(a-q);
		}
	}
}