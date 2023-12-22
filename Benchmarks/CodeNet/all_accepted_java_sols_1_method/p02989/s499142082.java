
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] d=new int[N];
		int K;
		
		for(int i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		
		Arrays.sort(d);
		
		if(d[(N/2)-1]==d[N/2]) {
			K=0;
		}
		else{
			K=d[N/2]-d[(N/2)-1];
		}
		
		System.out.println(K);
		
		sc.close();
	}
}
