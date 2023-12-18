import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		String str = null;
		String[] s;
		double[] n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		s = str.split(" ");
		n = new double[s.length];
		for(int i=0; i<s.length; i++){
			n[i] = Double.parseDouble(s[i]);
		}

		double r = Math.sqrt(Math.pow(n[0]-n[2], 2)+Math.pow(n[1]-n[3], 2));
		System.out.println(r);
	}
}