import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] A =  new int[N];
		for(int i=0; i<N; i++) {
			A[i] = s.nextInt();
		}
		
		Arrays.sort(A);
		int ans =1;
		for(int i=1; i<N; i++) {
			boolean waru = false;
			for(int k=0; k<i; k++) {
				if(A[i]%A[k] == 0) {waru = true; break;}
			}	
			if(!waru) {  ans++;}
		}
		System.out.println(ans);
	}

}
