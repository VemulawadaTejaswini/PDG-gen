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
		int n=s.length();
		int gg=0;
		for(int i=0;i<n;i++) {
			gg+=(s.charAt(i)-'0');
		}
		System.out.println(gg%9==0?"Yes":"No");
		
	}
    
    
		
}
