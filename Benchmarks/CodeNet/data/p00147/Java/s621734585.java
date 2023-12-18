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
		LinkedList<Integer> que=new LinkedList<Integer>();
		int[] wait=new int[100]; // Ò¿Ô
		int[] a=new int[17]; // ÀÁÄ¢éq
		int[] rest=new int[17]; // qªAéÜÅÌÔ
		int[] b=new int[17];

		for(int t=0;; t++){
			// HI¹
			for(int i=0; i<17; i++){
				if(--rest[i]<=0){
					a[i]=-1;
				}
			}

			// Vµ¢q
			if(t%5==0&&t<500){
				que.addLast(t/5);
			}

			// Âßçêé¾¯Âßé
			for(; !que.isEmpty();){
				int c=que.getFirst();
				int n=c%5==1?5:2;
				int j=-1;
				for(int i=16; i>=0; i--){
					b[i]=a[i]==-1?((i==16?0:b[i+1])+1):0;
					if(b[i]>=n){
						j=i;
					}
				}
				if(j==-1){
					break;
				}
				for(int i=j; i<j+n; i++){
					a[i]=c;
					rest[i]=17*(c%2)+3*(c%3)+19;
				}
				wait[c]=t-5*c;
				que.removeFirst();
			}

			if(t>500&&que.isEmpty()){
				break;
			}
		}

		for(; sc.hasNext();){
			println(""+wait[sc.nextInt()]);
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