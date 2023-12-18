import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int K = sc.nextInt();
      	int[] A = new int[N];
      	for (int i=0; i<N; i++) {A[i] = sc.nextInt();}
      	int[] R = new int[N - K + 1];
      	int delta;
      	int multi = 1;//掛け算の値
      	
      	for (int i = 0; i < N - K + 1; i++) {
          	multi = 1;
        	for (int j = i; j < i + K; j++) {
              	multi *= A[j];
            	}
          	R[i] = multi;
        }
      	
      	for (int i = 0; i < N - K; i++) {
        	delta = R[i + 1] - R[i];
          	if (delta > 0) {
              	System.out.println("Yes");
            } else {System.out.println("No");}
        }
	}
}