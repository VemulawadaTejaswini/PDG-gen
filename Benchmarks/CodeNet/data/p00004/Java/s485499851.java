import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String strArray[];
		double n[] = new double[6];
		double det,x=0,y=0;

		while((str=br.readLine()) != null){
			strArray = str.split(" ");

			for(int i=0; i<6; i++){
				n[i] = Double.parseDouble(strArray[i]);
			}

			det = n[1]*n[3] - n[0]*n[4];
			x = (n[1]*n[5] - n[4]*n[2])/det;
			y = (n[2]-n[0]*x)/n[1];

			System.out.println(String.format("%.3f ", x) + String.format("%.3f", y));

		}
	}
}