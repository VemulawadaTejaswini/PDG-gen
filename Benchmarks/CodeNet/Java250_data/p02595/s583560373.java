

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int count=0;
		double a=Math.pow(in.nextDouble(),2);
		for(int i=0;i<T;i++) {
			double a1=in.nextDouble(),a2=in.nextDouble();
			if(Math.pow(a1,2)+Math.pow(a2,2)<=a) {
				count++;
			}
		}
		System.out.println(count);
	}
}
