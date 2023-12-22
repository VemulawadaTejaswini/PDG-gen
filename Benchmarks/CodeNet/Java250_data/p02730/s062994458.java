import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		int N=S.length();
		char[] a;
		char[] b;
		int check=0;
		
		String x,y;
		x=S.substring(0,N/2);
		y=S.substring(N/2+1,N);
		if(x.equals(y)) {
			check++;
		}
		a=x.toCharArray();
		b=y.toCharArray();
		
		for(int i=0;i<x.length()/2;i++) {
			if(a[i]!=a[a.length-(i+1)]) {
				check--;
			}
		}
		for(int i=0;i<y.length()/2;i++) {
			if(b[i]!=b[b.length-(i+1)]) {
				check--;
			}
		}
		
		if(check==1) {
			System.out.println("Yes");
	    }else{
	    	System.out.println("No");
	    }		
	}		
}
	

