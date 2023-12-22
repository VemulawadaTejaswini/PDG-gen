import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		int n=inp.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) a[i]=inp.nextLong();
		long gg=0;
		long max=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<max) {
				gg+=max-a[i];
			}else {
				max=a[i];
			}
		}
		System.out.println(gg);
	}
    
    
		
}
