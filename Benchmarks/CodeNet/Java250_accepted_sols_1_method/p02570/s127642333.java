import java.util.*;

public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int D = ob.nextInt();
		int T = ob.nextInt();
		int S = ob.nextInt();
		int sum = 0;

		for(int i = 1; i <= T; i++){
			sum += S;
		}

		System.out.println((sum < D) ? "No" : "Yes");
		
		ob.close();
	}
}
