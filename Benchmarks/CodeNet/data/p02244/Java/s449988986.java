import java.io.*;
import java.util.*;

public class Main{

    static final int N=8;
    static int n;
    static int row[]=new int[N];
    static int col[]=new int[N];

    static int dpos[]=new int[2*N-1];
    static int dneg[]=new int[2*N-1];

    static boolean X[][]=new boolean[N][N];

    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	for(int i=0;i<N;i++){
	    row[i]=-1;
	    col[i]=-1;
	    for(int j=0;j<N;j++){
		X[i][j]=false;
	    }
	}

	for(int i=0;i<2*N-1;i++){
	    dpos[i]=-1;
	    dneg[i]=-1;
	}
	
	n=Integer.parseInt(br.readLine());

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    int r=Integer.parseInt(str[0]);
	    int c=Integer.parseInt(str[1]);

	    X[r][c]=true;
	}
	solve(0);
    }
    static void solve(int i){
	if(i==N){
	    print();
	}else{
	    for(int j=0;j<N;j++){
		if( (col[j]==1) || (dpos[i+j]==1) || (dneg[i-j+N-1]==1) ){
		    continue;
		}
		row[i]=j;
		col[j]=dpos[i+j]=dneg[i-j+N-1]=1;
		solve(i+1);
		row[i]=col[j]=dpos[i+j]=dneg[i-j+N-1]=-1;
	    }
	}
    }
    static void print(){
	for(int i=0;i<N;i++){
	    for(int j=0;j<N;j++){
		if(X[i][j]){
		    if(row[i]!=j)
			return;
		}
	    }
	}
	for(int i=0;i<N;i++){
	    for(int j=0;j<N;j++){
		if(row[i]==j)
		    System.out.print("Q");
		else
		    System.out.print(".");
	    }
	    System.out.println();
	}
    }
}

