import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		double hayasa=0;
		int kai=0;
		double byou=0;
		double takasa=0;
		boolean takai=false;
		for(int kk=0; kk<2;) {
			try {
				str=bfr.readLine();
				if(str.equals("")) {
					System.exit(0);
				}
				
				else if(str=="") {
					System.exit(0);
				}
				hayasa=Double.parseDouble(str);
				byou=hayasa/9.8;
				takasa=4.9*byou*byou;
				for(int i=1; i>0; i++) {
					if(takai==false && takasa+5<=i*5) {
						kai=i;
						break;
					}
				}
				System.out.println(kai);
			}catch(IOException e) {

			}
		}
	}
}
