import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int n=sc.nextInt();
			int k=sc.nextInt();
			if((n|k)==0){
				break;
			}
			boolean[] bs=new boolean[n];
			boolean blank=false;
			for(int i=0; i<k; i++){
				int a=sc.nextInt();
				if(a==0){
					blank=true;
				}else{
					bs[a-1]=true;
				}
			}
			int c=0;
			LinkedList<Integer> list=new LinkedList<Integer>();
			for(int i=0; i<n; i++){
				if(bs[i]){
					if(c>=0){
						c++;
					}else{
						list.add(c);
						c=1;
					}
				}else{
					if(c<=0){
						c--;
					}else{
						list.add(c);
						c=-1;
					}
				}
			}
			list.add(c);
			// debug(bs);
			// debug(list.toArray());
			int max=0;
			for(int i=0; i<list.size(); i++){
				max=max(max, list.get(i));
				if(list.get(i)==-1&&blank){
					int a=1;
					if(i>0){
						a+=list.get(i-1);
					}
					if(i<list.size()-1){
						a+=list.get(i+1);
					}
					max=max(max, a);
				}
			}
			println(max+"");
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}