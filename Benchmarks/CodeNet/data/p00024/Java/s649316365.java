import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		double hayasa;
		int kai=0;
		double byou;
		double takasa;
		try {
			str=bfr.readLine();
			hayasa=Double.parseDouble(str);
			byou=hayasa/9.8;
			takasa=4.9*byou*byou;
			kai=(int) Math.ceil((takasa+5)/5);
			System.out.println(kai);
		}catch(IOException e) {

		}

	}
}
