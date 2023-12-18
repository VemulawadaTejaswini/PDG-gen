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
		int[] wait=new int[100];
		int[] a=new int[17];
		int[] b=new int[17];
		int[] rest=new int[17];

		for(int t=0;; t++){
			// ツ食ツ篠鳴終ツ猟ケツづーツ渉慊外
			for(int i=0; i<17; i++){
				if(--rest[i]<=0){
					a[i]=-1;
				}
			}

			// ツ新ツつオツつ「ツ客
			if(t%5==0&&t<500){
				que.addLast(t/5);
			}

			// ツづつづ淞づァツづェツづゥツつセツつッツづつづ淞づゥ
			for(; !que.isEmpty();){
				int c=que.getFirst();
				int n=c%5==1?5:2;
				for(int i=16; i>=0; i--){
					if(a[i]==-1){
						b[i]=(i==16?0:b[i+1])+1;
					}else{
						b[i]=0;
					}
				}
				int j=-1;
				for(int i=0; i<17; i++){
					if(b[i]>=n){
						j=i;
						break;
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
			// debug(t, a);
			// debug(que.toArray());

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