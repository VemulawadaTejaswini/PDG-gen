import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Judge{
	String ans;
	void doit(int a,int b){
		if(a > b){
			ans = " > ";
		}
		else if(a < b){
			ans = " < ";
		}
		else{
			ans = " == ";
		}
		System.out.println("a" + ans + "b");
	}
}

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		Judge cr = new Judge();
		cr.doit(a,b);
	}
}