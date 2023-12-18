import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] A = new int[N];
      	for (int i=0; i<N ; i++) {A[i] = sc.nextInt();}
      
      	int c = 0;//counter
      	for (int j=0; j<N; j+=2) {
        	if (A[j] % 2 == 1) {c++;}
        }
      
      	System.out.println(c);
    }
}