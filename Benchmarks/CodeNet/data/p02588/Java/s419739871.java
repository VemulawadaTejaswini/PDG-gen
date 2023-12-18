import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    int cnt = 0;
		int size = Integer.parseInt(in.readLine());
		double[] num =  new double[size];

		for(int i=0; i < size; i++) {
			num[i] = Double.parseDouble(in.readLine());
		}

		for(int i=0; i < size-1; i++) {
			for(int j = 1; j < size; j++) {
				j += i;
				if(num[i]*num[j] == Math.floor(num[i]*num[j])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}