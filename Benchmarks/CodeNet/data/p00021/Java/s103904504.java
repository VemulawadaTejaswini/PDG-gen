
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		float[] kanri=new float[8];
		float[] vec1=new float[2];
		float[] vec2=new float[2];
		String aa="";
		float gaiseki=0;

		try {
			str=bfr.readLine();
			int kaisu=Integer.parseInt(str);

			for(int jj=0; jj<kaisu; jj++) {
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");
				for(int i=0; i<8; i++) {
					kanri[i]=Float.parseFloat(stk.nextToken());
				}
				for(int i=0; i<2; i++) {
					vec1[i]=kanri[i+2]-kanri[i];
					vec2[i]=kanri[i+6]-kanri[i+4];
				}
				gaiseki=vec1[1]*vec2[0]-vec1[0]*vec2[1];
				if(gaiseki==0.0f) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}

		}catch(IOException e) {

		}
	}
}

