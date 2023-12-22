import java.io.*;

class Main {
	public static void main(String[] args){
		double r, m, l;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();
			
			m = 0; 
			l = 0;
			r = Double.parseDouble(buf);
			m = Math.PI*r*r;
			l = 2*Math.PI*r;
			
		System.out.printf("%f %f\n", m, l);			
		}catch(Exception e){
		}
	}
}