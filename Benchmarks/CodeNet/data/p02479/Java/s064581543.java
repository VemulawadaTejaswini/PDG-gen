import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		new Main().round();
	}
	
	void round(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = br.readLine();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		double r = Double.parseDouble(str);
		double s = r*r*Math.PI;
		double l = 2*r*Math.PI;
		System.out.printf("%.6f %.6f",s,l);
		
	}
}