import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int min=Integer.valueOf(sc.next());
		int dmax=Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++){
			int next=Integer.valueOf(sc.next());
			int d=next-min;
			if(d>dmax)dmax=d;
			if(next<min)min=next;
		}
		System.out.println(dmax);
	}
}