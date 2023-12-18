import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		long a[] = new long[N];
		long R = 1l;
		long EX = 1000000000000000000l;

		for(int i = 0; i < N; i++){
			a[i] = ob.nextLong();
		}

		for(int j = 0; j < N; j++){
			R *= a[j];
		}

		//System.out.println(EX);

		if(R > EX){
			System.out.println(-1);	
		}
		else{
			System.out.println((long)R);
		}
	}
}
