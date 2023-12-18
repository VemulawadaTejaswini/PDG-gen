import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		sc.close();
		int taste[]=new int[N];
		int alltaste=0;
		int minabs,minnum=0;
		for(int i=0;i<N;i++) {
			taste[i]=Math.abs(L+i);
			alltaste+=L+i;
		}
		minabs=taste[0];
		for(int j=0;j<N;j++) {
			if(minabs>taste[j]) {
				minabs=taste[j];
				minnum=j;
			}
		}
		alltaste=alltaste-(L+minnum);
		System.out.println(alltaste);
	}
}