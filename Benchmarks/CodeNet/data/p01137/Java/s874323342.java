import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int e;

	void run(){
		for(;;){
			e=sc.nextInt();
			if(e==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		long min=e;
		for(long z=0; z*z*z<=e; z++){
			for(long y=0; y*y<=e; y++){
				long x=e-y*y-z*z*z;
				if(x>=0){
					min=min(min, x+y+z);
				}
			}
		}
		println(min+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}

}