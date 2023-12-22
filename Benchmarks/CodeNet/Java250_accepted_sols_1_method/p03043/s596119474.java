

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    sc.close();
	    
	    double P = 0;
	    for(int i = 1; i < N+1; i++) {
	    	int count = 0;
	    	int j = i;
	    	while (j<K){
	    		j=2*j;
	    		count++;
	    	}
	    	
	    	P =   P + (Math.pow(0.5, count))/N;
	    }
	    System.out.println(P);

	}

}
