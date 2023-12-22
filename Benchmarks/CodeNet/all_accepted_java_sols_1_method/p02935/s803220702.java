import java.util.*;
public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] v = new double[N];
		double[] val = new double[N];
		double ave = 0;
		for(int i=0;i<N;i++){
			v[i] = sc.nextDouble();
		}
		Arrays.sort(v);
		ave = (v[0] + v[1])/2;
		if(N > 2){
			for(int i = 1; i < N-1; i++){
				ave = (ave + v[i+1])/2;
			}
		}
		System.out.println(ave);
	}
}