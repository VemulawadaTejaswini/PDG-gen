import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b,c,i=0;

		String[] spl = br.readLine().split(" ");
		a = Integer.parseInt(spl[0]);
		b = Integer.parseInt(spl[1]);
		c = Integer.parseInt(spl[2]);
		for (int j = a; j <=b; j++) {

			if(c%j==0)i++;
		}

		System.out.println(i);
	}
}