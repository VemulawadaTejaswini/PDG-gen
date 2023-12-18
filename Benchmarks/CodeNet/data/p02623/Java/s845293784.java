import java.util.Scanner;

public class Main {

	static int[] A;
	static int[] B;
	static boolean flg=false;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int M=Integer.parseInt(scanner.next());
	    long K=Long.parseLong(scanner.next());
	    A=new int[N];
	    B=new int[M];
	    long ca=0;
	    long cb=0;
	    long tmp=0;
	    for (int i = 0; i<N; i++) {
	        A[i] =Integer.parseInt(scanner.next());
	        if (K>=tmp+A[i]) {
	        	tmp+=A[i];
	        	ca++;
	        }
	    }
	    for (int i = 0; i<M; i++) {
	        B[i] =Integer.parseInt(scanner.next());
	        if (K>=tmp+B[i]) {
	        	tmp+=B[i];
	        	cb++;
	        }
	    }

	    long cm = ca+cb;
	    for (int i=1; i<ca;i++) {
	    	long tmp2 = tmp;
	    	long cb2=0;
	    	long ca2=ca-i;
	    	for(int j=0; j<i; j++) {
	    		tmp2-=A[(int)ca-1-j];
	    	}
	    	for (int j = 0; j<M; j++) {
		        if (K>=tmp2+B[j]) {
		        	tmp2+=B[j];
		        	cb2++;
		        }else {
		        	break;
		        }
		    }
	    	if (cm<ca2+cb2) {
	    		cm=ca2+cb2;
	    	}
	    	if(cb==M) {
	    		break;
	    	}
	    }

	    System.out.println(cm);
	}
}