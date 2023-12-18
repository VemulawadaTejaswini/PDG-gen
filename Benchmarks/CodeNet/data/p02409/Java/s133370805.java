import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	final int B = 4;
	final int F = 3;
	final int R = 10;
	Scanner in =new Scanner(System.in);
	
	int[][][] room = new int[F][R][B];

	for(int k=0;k<B;k++){
	    for(int i=0; i<F; i++){
		for(int j=0; j<R; j++){
		    room[i][j][k]=0;
		}
	    }
	}

	int n = in.nextInt();
	for(int i=0;i<n;i++){
	    int b = in.nextInt();
	    int f = in.nextInt();
	    int r = in.nextInt();
	    int v = in.nextInt();
	    room[f-1][r-1][b-1]= v;
	    
	}

	for(int k=0;k<B;k++){
	    if(k>0 && k<=B-1)System.out.println("####################");
	     for(int i=0; i<F; i++){
		for(int j=0;j<R;j++){
		    System.out.print(room[i][j][k]);
		    if(j!=R-1)System.out.print(" ");
		}
		System.out.println();
	    }
	}
    }
}

