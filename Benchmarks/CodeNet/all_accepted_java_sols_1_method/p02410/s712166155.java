import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int y;

    	int[][] a = new int[N][M];
    	int[] c = new int[M] ;
    	//Arrays.fill(c, "");

    	for(int i=0;i<N;i++){
    	   for(int p=0;p<M;p++){
    		   int z = sc.nextInt();
    	      a[i][p] = z;
    	   }
    	}

        for(int p=0;p<M;p++){
        	int z = sc.nextInt();
    	      c[p] = z;
    	 }

        for(int i=0;i<N;i++){
           y =0;
    	   for(int p=0;p<M;p++){
    	     y += a[i][p] * c[p];

    	   }
    	   System.out.println(y);
    	}
    }
}