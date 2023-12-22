import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//2????????´??°?????\???
		String data[] = br.readLine().split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int d = a / b;
		int r = a % b;
		double f;
		f = (double)a / b;

		System.out.print(d +" "+ r +" ");
		System.out.printf("%.5f\n",f);





	}

}