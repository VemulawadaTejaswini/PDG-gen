import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;

		try {
			str=bfr.readLine();

			if(str=="") {
				System.exit(0);
			}

			stk=new StringTokenizer(str," ");

			int tatemono_kazu=Integer.parseInt(stk.nextToken());
			int tower_basyo=Integer.parseInt(stk.nextToken());

			int [][] tatemono=new int[tatemono_kazu][2];		//tatemono_ichi takasa
			double[] katamuki=new double[tatemono_kazu];
			double katamuki_max=0;

			for(int i=0; i<tatemono_kazu; i++) {
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");

				for(int j=0; j<2; j++) {
					tatemono[i][j]=Integer.parseInt(stk.nextToken());
				}
				katamuki[i]=((double)(tatemono[i][1]))/((double)(tatemono[i][0]));
				if(katamuki_max<katamuki[i]) {
					katamuki_max=katamuki[i];
				}
				if(str=="") {
					System.exit(0);
				}
			}

			System.out.println(BigDecimal.valueOf(katamuki_max*((double)(tower_basyo))).toPlainString());

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
