import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO ??????????????????????????????????????????

		String str;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();


		String[] st = str.split(" ");

		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);

		int area = a*b;
		int cir = (2*a)+(2*b);

		System.out.println(area+(" ")+cir);

	}

}