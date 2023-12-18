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
			if(n==0){
				break;
			}
			LinkedList<Integer> list=new LinkedList<Integer>();
			for(int i=1; i<=n; i++){
				int c=sc.nextInt()*2-1;
				// 0:white,1:black
				// -:white, +:black
				int d=0;
				if(!list.isEmpty()){
					d=list.pop();
				}
				if(c*d>=0){
					list.push(c+d);
				}else{
					if(i%2==1){
						list.push(d);
						list.push(c);
					}else{
						int e=0;
						if(!list.isEmpty()){
							e=list.pop();
						}
						list.push((abs(e)+abs(d)+abs(c))*c);
					}
				}
			}
			int ans=0;
			for(int c : list){
				if(c<0){
					ans-=c;
				}
			}
			println(ans+"");
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