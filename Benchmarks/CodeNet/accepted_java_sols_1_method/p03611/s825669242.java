import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int T=in.nextInt();
			int max=0;
			int[] a=new int[100000+5];
			for(int i=0;i<T;i++) {
				int b=in.nextInt();
				a[b]++;
				max=(a[b]>max)?a[b]:max;
				if(b!=0) {
					a[b-1]++;
					max=(a[b-1]>max)?a[b-1]:max;
				}
				a[b+1]++;
				max=(a[b+1]>max)?a[b+1]:max;
			}
			System.out.println(max);
		}
	}
}