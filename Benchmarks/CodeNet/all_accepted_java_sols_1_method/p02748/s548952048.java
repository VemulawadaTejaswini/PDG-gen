import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int na=sc.nextInt(),nb=sc.nextInt(),nm=sc.nextInt();
		long[] a=new long[na];
		long[] b=new long[nb];
		long[][] m=new long[nm][3];
		long[] buffa=new long[na];
		long[] buffb=new long[nb];
		
		for(int i=0;i<na;i++) {
			a[i]=sc.nextLong();
			buffa[i]=a[i];
		}
		for(int i=0;i<nb;i++) {
			b[i]=sc.nextLong();
			buffb[i]=b[i];
		}
		for(int i=0;i<nm;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=sc.nextLong();
			}
		}
		
		Arrays.sort(buffa);
		Arrays.sort(buffb);
		long min=(long)(buffa[0]+buffb[0]);
		for(int i=0;i<nm;i++) {
			int x=(int)m[i][0]-1,y=(int)m[i][1]-1,c=(int)m[i][2];
			min=Math.min(min, (long)(a[x]+b[y]-c));
			//System.out.println(a[x]+b[y]-c);
		}
		System.out.println(min);
	}
}
