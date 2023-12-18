import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.sort(a);
		//System.err.println(Arrays.toString(a));
		System.out.println(a[n/2]-a[n/2-1]);
	}
}
