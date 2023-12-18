import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{

	Scanner sc=new Scanner(System.in);;

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int y1=sc.nextInt();
			int m1=sc.nextInt();
			int d1=sc.nextInt();
			int y2=sc.nextInt();
			int m2=sc.nextInt();
			int d2=sc.nextInt();
			if(y1<0||m1<0||d1<0||y2<0||m2<0||d2<0){
				break;
			}
			int a=day(y1, m1, d1);
			int b=day(y2, m2, d2);
			println((b-a)+"");
		}
	}

	int day(int y, int m, int d){
		int res=0;
		int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<m-1; i++){
			res+=days[i];
		}
		res+=y*365+d-1;
		if((m==2&&d<=28)||m==1){
			y--;
		}
		if(y>=0){
			res+=y/4+1;
			res-=y/100+1;
			res+=y/400+1;
		}
		return res;
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
		new Main().run();
	}
}