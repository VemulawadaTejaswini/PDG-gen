import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		int H = 0;
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = 0; i <((N*(N-1))/2); i++) {
			j = i+1; 
			while(j < N) {
				int h = d[i] * d[j];
				H = h + H;
				j++;
			}
		}
		System.out.println(H);
	}
}