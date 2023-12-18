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
		
		String s=inp.next();
		String t=inp.next();
		int n=s.length();
		int m=t.length();
		int gg=m;
		for(int i=0;i<=n-m;i++) {
			int c=m;
			for(int j=0;j<m;j++) {
				if(s.charAt(i+j)==t.charAt(j)) c--;
			}
			gg=Math.min(gg, c);
		}
		System.out.println(gg);
	}
    
    
		
}
