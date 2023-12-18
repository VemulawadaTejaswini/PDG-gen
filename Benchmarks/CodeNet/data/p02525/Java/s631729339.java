import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String scoreArray[];
		int n;
		double ave=0,m,a,sm=0;

		while(!(str=br.readLine()).equals("0")){
			n=Integer.parseInt(str);

			double s[] = new double[n];

			str=br.readLine();
			scoreArray=str.split(" ");

			for(int i=0; i<n; i++){
				s[i] = Double.parseDouble(scoreArray[i]);
				ave += s[i];
			}

			m=ave/n;

			for(int i=0; i<n; i++){
				sm += Math.pow(s[i]-m, 2);
			}

			a=Math.sqrt(sm/n);
			System.out.println(a);

		}
	}
}