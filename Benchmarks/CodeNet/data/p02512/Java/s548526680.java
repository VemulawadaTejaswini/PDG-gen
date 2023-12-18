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

	int[][][] patterns={
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},
			{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0},},};

	char[][] cs;

	void run(){
		int[] x1={7, 0, 7, 14, 21, 7};
		int[] y1={0, 7, 7, 7, 7, 14};

		int[] x2={36, 29, 36, 43, 50, 36};
		int[] y2={0, 7, 7, 7, 7, 14};

		for(;;){
			cs=new char[21][57];
			for(int j=0; j<21; j++){
				String s=sc.nextLine();
				if(s.equals("0")){
					return;
				}
				cs[j]=s.toCharArray();
			}
			int[] a1=new int[6];
			int[] a2=new int[6];
			int sum1=0, sum2=0;
			for(int i=0; i<6; i++){
				a1[i]=match(x1[i], y1[i], i);
				a2[i]=match(x2[i], y2[i], i);
				sum1+=a1[i];
				sum2+=a2[i];
			}
			debug(a1);
			debug(a2);
			debug(sum1>=sum2?"HIGH":"LOW");
			println(sum1>=sum2?"HIGH":"LOW");
		}
	}

	int match(int x, int y, int rot){
		int match=-1;
		int m=7;
		for(int k=0; k<9; k++){
			boolean ok=true;
			for(int j=0; j<m; j++){
				for(int i=0; i<m; i++){
					int p=patterns[k][j][i];
					char c='\0';
					if(rot==0){
						// ¶E½]
						// ok&=patterns[k][j][i]==0||cs[y+j][x+(m-1-i)]!='.';
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==1){
						// ¶E½]A»Ì ÆÅ½vñèÉ90xñ]
						// ok&=patterns[k][j][i]==0||cs[y+i][x+j]!='.';
						c=cs[y+i][x+j];
					}else if(rot==2){
						// ¶E½]
						// ok&=patterns[k][j][i]==0||cs[y+j][x+(m-1-i)]!='.';
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==3){
						// ¶E½]A»Ì ÆÅ½vñèÉ270xñ]
						// ok&=patterns[k][j][i]==0||cs[y+(m-1-i)][x+(m-1-j)]!='.';
						c=cs[y+(m-1-i)][x+(m-1-j)];
					}else if(rot==4){
						// ¶E½]
						// ok&=patterns[k][j][i]==0||cs[y+j][x+(m-1-i)]!='.';
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==5){
						// ãº½]A»Ì ÆÅ¶E½]
						// ok&=patterns[k][j][i]==0||cs[y+(m-1-j)][x+(m-1-i)]!='.';
						c=cs[y+(m-1-j)][x+(m-1-i)];
					}
					if(p==0){
						ok&=c=='.'||c=='#';
					}else{
						ok&=c=='|'||c=='-';
					}
				}
			}
			if(ok){
				return k+1;
			}
		}
		return match;
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
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