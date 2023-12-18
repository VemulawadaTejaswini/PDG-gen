import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] ary=new int[N];
		for(int i=0; i<N; i++) {
			ary[i]=sc.nextInt();
		}
		Arrays.sort(ary);
		int max=ary[N-1];
		int k=Integer.MAX_VALUE;
		int ati=0;
		for(int i=0; i<N; i++) {
			int tmp=ary[i];
			if(max%2==1) {
				if(k>Math.abs(ary[i]-(max+1)/2)) {
					ati=tmp;
					k=Math.abs(ary[i]-(max+1)/2);
				}
			}
			else if(max%2==0) {
				if(k>Math.min(Math.abs(ary[i]-(max/2)),Math.abs(ary[i]-(max)/2)+1)) {
					ati=tmp;
					k=Math.min(Math.abs(ary[i]-(max/2)),Math.abs(ary[i]-(max)/2)+1);
				}
			}
		}
		System.out.println(max+" "+ati);
		sc.close();
	}
}