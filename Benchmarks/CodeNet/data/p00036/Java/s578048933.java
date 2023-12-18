import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String[] ume=new String[8];
		int[][] mj=new int[10][10];

		while(true) {
			mj=new int[10][10];
			ume=new String[8];
			for(int i=1; i<=8; i++) {
				ume[i-1]=bfr.readLine();
				for(int j=1; j<=8; j++) {
					if((ume[i-1].charAt(j-1)+"").equals("0")) {
						mj[i][j]=0;
					}
					else{
						mj[i][j]=1;
					}
				}
			}
			boolean solved=false;
			int sx=0;
			int sy=0;
			for(int i=1; i<=8; i++) {
				for(int j=1; j<=8; j++) {
					if(mj[i][j]==1 && solved==false) {
						sx=j;
						sy=i;
						solved=true;
					}
				}
			}

			if(mj[sy][sx]==1 && mj[sy][sx+1]==1 && mj[sy+1][sx]==1 && mj[sy+1][sx+1]==1) {
				System.out.println("A");
			}
			else if(mj[sy][sx]==1 && mj[sy+1][sx]==1 && mj[sy+2][sx]==1 && mj[sy+3][sx]==1) {
				System.out.println("B");
			}
			else if(mj[sy][sx]==1 && mj[sy][sx+1]==1 && mj[sy][sx+2]==1 && mj[sy][sx+3]==1) {
				System.out.println("C");
			}
			else if(mj[sy][sx]==1 && mj[sy+1][sx]==1 && mj[sy+1][sx-1]==1 && mj[sy+2][sx-1]==1) {
				System.out.println("D");
			}
			else if(mj[sy][sx]==1 && mj[sy][sx+1]==1 && mj[sy+1][sx+1]==1 && mj[sy+1][sx+2]==1) {
				System.out.println("E");
			}
			else if(mj[sy][sx]==1 && mj[sy+1][sx]==1 && mj[sy+1][sx+1]==1 && mj[sy+2][sx+1]==1) {
				System.out.println("F");
			}
			else if(mj[sy][sx]==1 && mj[sy+1][sx]==1 && mj[sy][sx+1]==1 && mj[sy+1][sx-1]==1) {
				System.out.println("G");
			}
		}
	}
}
