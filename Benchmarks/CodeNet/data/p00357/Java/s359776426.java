import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int n=getInt(),a[]=new int[n],b[]=new int[n];

		for(int i=0;i<n;++i)
			b[n-i-1]=a[i]=getInt();
		
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));

		System.out.println(solve(n,a)&&solve(n,b)?"yes":"no");
	}
	private static boolean solve(int n,int[]a){
		int max=0;
		for(int i=0;i<=max&&i/10<n;i+=10) {
			max=Math.max(max,i+a[i/10]);
		}
		return max>=n*10;
	}
}