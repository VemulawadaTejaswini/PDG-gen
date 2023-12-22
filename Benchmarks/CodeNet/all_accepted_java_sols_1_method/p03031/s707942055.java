
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int S[]= new int [M];
	    
	    for (int i = 0; i < M; i ++) {
			int ki = sc.nextInt();
			for (int j = 0; j < ki; j ++) {
				S[i] += 1 << (sc.nextInt() - 1);
				//System.out.println(Integer.toBinaryString(S[i]));
			}
		}
	    
	    
	    int p [] = new int [M];
	    for (int i = 0; i < M; i++) {
	    	p[i]=sc.nextInt();
	    }
	    
	    sc.close();
	    
	    long ans = 0;
	    for (int i = 0; i < Math.pow(2,N); i++) {
	    	boolean ok = true;
			for (int j = 0; j < M; j++) {
				if (Integer.bitCount(S[j] & i) % 2 != p[j]) {
					ok = false;
					break;
				}
			}
			if (ok) 
				ans ++; 
	    	
	    }
	    System.out.println(ans);
	    
	}

}
