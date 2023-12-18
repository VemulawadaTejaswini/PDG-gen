import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ2012();
	}
	
	void AOJ2012(){
		while(sc.hasNext()){
			int e=sc.nextInt(), ans=Integer.MAX_VALUE;
			if(e==0)	break;
			for(int i=0; i<=e; i++){
				for(int j=0; j*j+i<=e; j++){
					for(int k=0; k*k*k+j*j+i<=e; k++){
						if(i+j*j+k*k*k==e)	ans=min(ans,i+j+k);
					}
				}
			}
			out.println(ans);
		}
	}
}