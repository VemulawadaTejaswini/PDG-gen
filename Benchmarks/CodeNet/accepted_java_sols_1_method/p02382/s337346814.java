import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		String[] x = br.readLine().split(" ");

		String[] y = br.readLine().split(" ");

		Double p =0.0;

		Double p1 = 0.0 ;

		Double p2 = 0.0 ;

		Double p3 = 0.0;

		Double max = 0.0;



		for(int i= 0; i<Integer.parseInt(n); i++){

			p = Math.abs(Double.parseDouble(x[i])-Double.parseDouble(y[i]));

			p1 +=p;

			p2 += Math.pow(p, 2);

			p3 += Math.pow(p, 3);

			max = Math.max(max, p);

		}

		System.out.print(p1+"\n"+Math.sqrt(p2)+"\n"+Math.cbrt(p3)+"\n"+max+"\n");
	}

}