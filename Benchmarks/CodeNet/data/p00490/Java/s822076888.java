import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int Ap = s.nextInt();
		int Bp = s.nextInt();
		int C = s.nextInt();
		int P = Ap;
		int t[] = new int[n];
		
		for(int i=0; i<n; i++){
			t[i] = s.nextInt();
		}
		
		Arrays.sort(t);
		
		  if((double)t[n-1]/Bp > (double)C/P){
			   C+=t[n-1];
			   P+=Bp;
			  }
			  if((double)t[n-2]/Bp > (double)C/P){
			   C+=t[n-2];
			   P+=Bp;
			  }
		

		System.out.println(C/P);

	}
}