import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(buf.readLine());
		String[] str = buf.readLine().split(" ");
	
		long sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, tmp = 0; 
		for (int i = 0; i < n; i++) {
			tmp = Integer.parseInt(str[i]);
			if(tmp < min)min = tmp;
			if(tmp > max)max = tmp;
			sum = sum + tmp;
		}
		System.out.println(min+" "+max+" "+sum);
	}

}