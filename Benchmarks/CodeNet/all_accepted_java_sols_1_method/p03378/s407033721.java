import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
		int[] a = new int[m];
		for(int i=0; i<m; i++) {
			a[i]=sc.nextInt();
		}
		int cost1=0,cost2=0;
		for (Integer i : a) {
			if(i > x) cost1++;
			else cost2++;
		}
		System.out.println(cost1 < cost2 ? cost1:cost2);
	}
}
