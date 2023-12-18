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
		float r = Float.parseFloat(str);
		float s = (float)(r*r*Math.PI);
		float l = (float)(2*r*Math.PI);
		System.out.println(s + " " + l);
		
	}
}