import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int A[][]=new int[N][2];
		for(int i=0;i<N;i++) {
			A[i][0]=scan.nextInt();
			A[i][1]=1;
		}
		for(int i=0;i<M;i++) {
	    int x=scan.nextInt();
	    int y=scan.nextInt();
	    if(A[x-1][0]>A[y-1][0]) {
	    	A[y-1][1]=0;
	    }
	    else if(A[x-1][0]<A[y-1][0]) {
	    	A[x-1][1]=0;
	    }
	    else {A[y-1][1]=0;A[x-1][1]=0;
	    }
		}
		int num=0;
		for(int i=0;i<N;i++) {
			if(A[i][1]==1) {
				num++;
			}
			else {}
		}
		System.out.println(num);
	}

}
