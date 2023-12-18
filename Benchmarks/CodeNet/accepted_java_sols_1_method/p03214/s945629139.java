import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;

		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int dmin = 100*N;
		int frame = -1;
		for(int i=0; i<N; i++){
			int d = Math.abs(sum-(a[i]*N));
			if(d<dmin){
				dmin = d;
				frame = i;
			}
		}
		System.out.println(frame);
	}
}
