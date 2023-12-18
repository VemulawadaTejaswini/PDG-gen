import java.util.Scanner;

public class Main{
	
	void main() {
		 Scanner sc = new Scanner(System.in);
	     int N = sc.nextInt();
	     int M = sc.nextInt();
	     
	     int[] score = new int[N];
	     
	     int[] t = new int[M];
	     for(int i=0;i<M;i++) {
	    	 t[i] = sc.nextInt();
	     }
	     
	     for(int i=0;i<M;i++) {
	    	 for(int j=0;j<N;j++) {
	    		 int b = sc.nextInt();
	    		 if(b == t[i]) {
	    			 score[j]++;
	    		 }else {
	    			 score[t[i]-1]++;
	    		 }
	    	 }
	     }
	     
	     for(int i=0;i<N;i++) {
	    	 System.out.println(score[i]);
	     }
    }

    public static void main(String[] args) {
        new Main().main();
    }



}
