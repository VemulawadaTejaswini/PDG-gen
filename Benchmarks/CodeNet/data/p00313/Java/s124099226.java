import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	public static void main (String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		String str="";
		int ninzu=0;
		List<Integer> kasanari=new ArrayList<Integer>();
		List<Integer> res=new ArrayList<Integer>();
		int[][] mono;
		int suuji=0;
		int suj1=0,suj2=0;
		boolean yousotu=true;
		try {
			str=bfr.readLine();
			ninzu=Integer.parseInt(str);

			if(str.equals("")) {
				System.exit(0);
			}
			else {
				mono=new int[3][ninzu];
				for(int i=0; i<3; i++) {
					for(int j=0; j<ninzu; j++) {
						mono[i][j]=0;
					}
				}
				for(int i=0; i<3; i++) {
					str=bfr.readLine();
					stk=new StringTokenizer(str," ");
					int kazu=Integer.parseInt(stk.nextToken());
					for(int j=0; j<kazu; j++) {
						mono[i][j]=Integer.parseInt(stk.nextToken());
					}
					}
					//BB && CC
				for(int i=0; mono[2][i]>0; i++) {
					suuji=mono[2][i];

					for(int j=0; mono[1][j]>0; j++) {
						if(suuji==mono[1][j]) {
							kasanari.add(suuji);
						}
					}
				}
				// A && NOT B && NOT C
				/*for(int h=0; mono[2][h]>0; h++) {
					suuji=mono[2][h];
					for(int i=0; mono[1][i]>0; i++) {
						suj1=mono[1][i];
						for(int j=0; mono[1][j]>0; j++) {
							suj2=mono[0][j];
							if(suuji!=suj1 && suuji!=suj2 && yousotu==true) {
								yousotu=true;
							}
							else {
								yousotu=false;
							}
						}
					}

					if(yousotu==true) {
						kasanari.add(suuji);
					}
					yousotu=true;
				}*/

				for(int i=0; mono[2][i]>0; i++) {
					for(int j=0; mono[1][j]>0; j++) {
						suj1=mono[2][i];
						suj2=mono[1][j];
						for(int h=0; mono[0][h]>0; h++) {
							if(suj2!=mono[0][h] && suj2!=mono[1][j]) {
								yousotu=true;
							}
							else {yousotu=false;}
						}
					}

					if(yousotu==true) {
						if(kasanari.contains(suj1)) {
							//nanimosinai
						}
						else {
						kasanari.add(suj1);
						}
					}

					yousotu=true;
				}

				System.out.println(kasanari.size());
			}
			}catch(IOException e) {
		}
	}
}
