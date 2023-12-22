import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int Q=Integer.parseInt(scanner.next());
	    String S =scanner.next();
	    S=S.replaceAll("AC", "aC");
	    int[] L=new int[Q];
	    int[] R=new int[Q];
	    int[] t = new int[N+1];

	    for(int i=0; i<Q;i++) {
	    	L[i]=Integer.parseInt(scanner.next());
	    	R[i]=Integer.parseInt(scanner.next());
	    }

	    int c= 0;
	    t[0]=0;
	    for (int i=0; i<N;i++) {
	    	if (S.charAt(i) == 'a') {
	    	    c++;
	    	}
	    	t[i+1]=c;
	    }

	    for (int i=0; i<Q; i++) {
	    	int ca=t[R[i]-1] - t[L[i]-1];


	    	System.out.println(ca);
	    }

	}
}