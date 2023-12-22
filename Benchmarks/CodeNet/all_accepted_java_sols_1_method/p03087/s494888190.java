import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Q = sc.nextInt();
		String S = sc.next();
		int[] arr = new int[N];
		int[] psa = new int[N];
		psa[0] = 0;
		for (int i=1; i<N; i++){
			if (S.charAt(i)=='C' && S.charAt(i-1)=='A'){
				arr[i] = 1;	
			}
			psa[i]+=arr[i]+psa[i-1];
		}
		for (int i=0; i<Q; i++){
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(psa[r-1]-psa[l-1]);
		}
		
	}

}