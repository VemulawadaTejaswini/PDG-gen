import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Kagisys
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	int n, m;
	String[] us, ts;

	void run(){
		n=sc.nextInt();
		us=new String[n];
		for(int i=0; i<n; i++){
			us[i]=sc.next();
		}
		m=sc.nextInt();
		ts=new String[m];
		for(int i=0; i<m; i++){
			ts[i]=sc.next();
		}
		solve();
	}

	void solve(){
		HashSet<String> registered=new HashSet<String>();
		for(String u : us){
			registered.add(u);
		}
		boolean opend=false;
		for(String t : ts){
			if(registered.contains(t)){
				if(opend){
					println("Closed by "+t);
				}else{
					println("Opened by "+t);
				}
				opend=!opend;
			}else{
				println("Unknown "+t);
			}
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}