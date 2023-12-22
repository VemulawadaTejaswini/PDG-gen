import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long d=sc.nextInt();
		long[] xy=new long[4];
		xy[0]=a*c;
		xy[1]=a*d;
		xy[2]=b*c;
		xy[3]=b*d;
		long ans=xy[0];
		for(int i=0;i<4;i++){
			ans=Math.max(xy[i],ans);
		}
		System.out.println(ans);
	}
}