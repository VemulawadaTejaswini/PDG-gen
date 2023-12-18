import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		long res = 0;
		int[] data = new int[N];
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			data[i] = input;
		}
		for(int i = 1; i<N; i++){
			int r = data[i];
			int l = data[i-1];
			if ( (r-l)*A > B){
				res+=B;
			}
			else{
				res+=A*(r-l);
			}
		}
		System.out.println(res);
	}
}
