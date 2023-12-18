import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public int getPos(char s){
		switch(s){
		case '1':case '4':case '7':return 0;
		default:return 1;
		case '3':case '6':case '9':return 2;
		}
	}

	public void run() {
		TCase:while(true){
			String sstr=sc.next();
			if("#".equals(sstr))return;
			char[] steps=sstr.toCharArray();

			int[][][] prev=new int[3][3][2];
			for(char step:steps){
				int[][][] next=new int[3][3][2];
				for(int l=0;l<3;l++)for(int r=0;r<3;r++)
						Arrays.fill(next[l][r],Integer.MAX_VALUE/10);

				int pos=getPos(step);
				//左足で踏む
				for(int r=pos;r<3;r++){
					int minv =Integer.MAX_VALUE;
					for(int l=0;l<3;l++)
						minv=min(minv,prev[l][r][1]);
					for(int l=0;l<3;l++)
						minv=min(minv,prev[l][r][0]+1);

					next[pos][r][0]=minv;
				}
				//右足で踏む
				for(int l=0;l<=pos;l++){
					int minv =Integer.MAX_VALUE;
					for(int r=0;r<3;r++)
						minv=min(minv,prev[l][r][0]);
					for(int r=0;r<3;r++)
						minv=min(minv,prev[l][r][1]+1);

					next[l][pos][1]=minv;
				}
				prev=next;
			}

			int minv=Integer.MAX_VALUE;
			for(int l=0;l<3;l++)
				for(int r=0;r<3;r++)
					for(int d=0;d<2;d++)
						minv=min(prev[l][r][d],minv);

			ln(minv);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}