import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		String[] moji;
		String[] rts;
		int mazu=0;
		StringBuilder stb;

		while(true) {
			str=bfr.readLine();
			mazu=Integer.parseInt(str);
			if(mazu==0) {
				System.exit(0);
			}
			else {
				moji=new String[mazu];
				for(int i=0; i<mazu; i++) {
					moji[i]=bfr.readLine();
				}
				int[][] spread=new int[mazu+1][mazu+1];

				for(int i=0; i<mazu+1; i++) {
					for(int j=0; j<mazu+1; j++) {
						spread[i][j]=0;
					}
				}
				for(int i=0; i<mazu; i++) {
					rts=moji[i].split(" ");
					for(int j=0; j<mazu; j++) {
						spread[j][i]=Integer.parseInt(rts[j]);
					}
				}
				for(int i=0; i<mazu; i++) {
					for(int j=0; j<mazu; j++) {
						spread[mazu][i]+=spread[j][i];
					}
				}
				for(int i=0; i<=mazu; i++) {
					for(int j=0; j<mazu; j++) {
						spread[i][mazu]+=spread[i][j];
					}
				}
				int space=0;
				int tmp=0;
				for(int i=0; i<=mazu; i++) {
					stb=new StringBuilder();
					for(int j=0; j<=mazu; j++) {
						tmp=spread[j][i];
						for(int k=0; tmp>0; k++) {
							tmp=tmp/10;
							space++;
						}
						for(int k=0; k<5-space; k++) {
							stb.append(" ");
						}
						stb.append(spread[j][i]);
						space=0;
					}
					 System.out.println(new String(stb));
				}
			}
		}
	}
}
