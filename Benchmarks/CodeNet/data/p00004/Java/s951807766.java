import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] num1 = br.readLine().split(" ");

		Double[] array = new Double[num1.length] ;

		Double x, y =0.0000;

		for(int i=0; i<num1.length; i++){
			array[i] = Double.parseDouble(num1[i]);
		}

		Double tmp = array[3]/array[0];

		array[1] *= tmp;  array[2] *= tmp;

		y = (array[2]-array[5])/(array[1]-array[4]);

		x= (array[5]-array[4]*y)/array[3];

		System.out.println(String.format("%.3f", x)+" "+String.format("%.3f", y));



/*		Double num = Double.parseDouble(num1);

		System.out.println(String.format("%.3f", num));
*/
	}

}