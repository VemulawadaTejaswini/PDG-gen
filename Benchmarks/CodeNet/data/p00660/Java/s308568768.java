import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// High and Low Cube
// 2012/12/04
public class Main{
	Scanner sc=new Scanner(System.in);

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
			cs=new char[21][];
			for(int j=0; j<21; j++){
				String s=sc.nextLine();
				if(s.equals("0")){
					return;
				}
				cs[j]=s.toCharArray();
			}

			int[] a1=new int[6];
			int[] a2=new int[6];
			for(int i=0; i<6; i++){
				a1[i]=match(x1[i], y1[i], i);
				a2[i]=match(x2[i], y2[i], i);
			}

			int high=0, low=0;
			for(int j=0; j<6; j++){
				for(int i=0; i<6; i++){
					if(a1[i]>a2[j]){
						high++;
					}else if(a1[i]<a2[j]){
						low++;
					}
				}
			}

			println(high>=low?"HIGH":"LOW");
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
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==1){
						c=cs[y+i][x+j];
					}else if(rot==2){
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==3){
						c=cs[y+(m-1-i)][x+(m-1-j)];
					}else if(rot==4){
						c=cs[y+j][x+(m-1-i)];
					}else if(rot==5){
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

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}