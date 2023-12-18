import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String strArray[];
		float num[] = new float[6];
		float x,y;

		while((str=br.readLine()) != null){
			strArray = str.split(" ");

			for(int i=0; i<6; i++){
				num[i] = Float.parseFloat(strArray[i]);
			}

			x = (num[1]*num[5] - num[4]*num[2])/(num[1]*num[4] - num[0]*num[4]);
			y = (num[2] - num[0]*x)/num[1];

			System.out.println(x + " " + y);

		}
	}
}