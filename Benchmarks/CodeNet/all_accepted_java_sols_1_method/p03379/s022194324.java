import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x[]=new int[N];
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			x[i]=in.nextInt();
			a[i]=x[i];
		}
		Arrays.sort(x);
		for(int i=0;i<N;i++) {
			if(a[i]<x[N/2]) {
				System.out.println(x[N/2]);
			}else{
				System.out.println(x[N/2-1]);
			}
		}
	}

}
