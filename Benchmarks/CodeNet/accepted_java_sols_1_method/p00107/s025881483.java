import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];


		while(!(str=br.readLine()).equals("0 0 0")){
			strArray=str.split(" ");
			int n = Integer.parseInt(br.readLine());
			boolean judge[] = new boolean[n];

			double a = Double.parseDouble(strArray[0]);
			double b = Double.parseDouble(strArray[1]);
			double c = Double.parseDouble(strArray[2]);

			double ab = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			double bc = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
			double ca = Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2));

			for(int i=0; i<n; i++){
				double r = 2*Double.parseDouble(br.readLine());
				if(r > ab || r > bc || r > ca){
					judge[i] = true;
				}
			}

			for(int i=0; i<n; i++){
				System.out.println(judge[i] ? "OK" : "NA");
			}
		}

	}
}