import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] strArray;
		int n;
		double p[] = new double[3];

		str = br.readLine();

		n = Integer.parseInt(str);

		if(n <= 1000){
			for(int i=0; i<n; i++){
				str = br.readLine();

				strArray = str.split(" ");

				for(int j=0; j<strArray.length; j++){
					p[j] = Double.parseDouble(strArray[j]);
				}

				Arrays.sort(p);

				if((Math.pow(p[0], 2) + Math.pow(p[1], 2)) == Math.pow(p[2], 2) ){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}

			}
		}
	}
}