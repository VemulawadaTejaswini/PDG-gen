import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=n/11;
		long y=n%11;
		int r = 0;
		if(y>0){
			r= y<=6?1 : 2;
		}
		System.out.print(x*2+r);
	}
}