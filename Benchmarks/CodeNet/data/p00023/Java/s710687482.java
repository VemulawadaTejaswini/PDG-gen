import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		String str="";
		StringTokenizer stk;
		int sets;
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		double[] tama1,tama2;
		String[] jh;
		double dist1=0,dist2=0;

		try {
			str=bfr.readLine();
			sets =Integer.parseInt(str);
			tama1=new double[3];
			tama2=new double[3];
			for(int i=0; i<sets; i++) {
				str=bfr.readLine();
				jh=str.split(" ",6);
				for(int j=0; j<3; j++) {
					tama1[j]=Double.parseDouble(jh[j]);
				}
				for(int j=0; j<3; j++) {
					tama2[j]=Double.parseDouble(jh[j+3]);
				}
				dist1=Math.sqrt((tama2[1]-tama1[1])*(tama2[1]-tama1[1])+(tama2[0]-tama1[0])*(tama2[0]-tama1[0]));
				dist2=tama1[2]+tama2[2];

				if(dist1>dist2) {
					System.out.println("0");
				}
				else if(dist1<=dist2 && Math.abs(tama1[2]-tama2[2])<dist1) {
					System.out.println("1");
				}
				else if(dist1<tama1[2]-tama2[2]) {
					System.out.println("2");
				}
				else if(dist1<tama2[2]-tama1[2]) {
					System.out.println("-2");
				}
			}
		}catch(IOException e) {

		}
	}
}
