import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		int[] r=new int[N];
		String[] a=sc.nextLine().split(" ");
		for(int i=0,c=0;i<N-1;i++) {
			int now=Integer.parseInt(a[i]);
			int next=Integer.parseInt(a[i+1]);
			if(now<next) {
				c=0;
			}else {
				r[i]=++c;
			}
		}
		Arrays.parallelSort(r);
		System.out.println(r[N-1]);
	}
}