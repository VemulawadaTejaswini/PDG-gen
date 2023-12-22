
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	static int[] num;
	final static int AB = 753;
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			num = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
			int min = 999;
			for(int i=0; i<num.length-2; i++) {
				String r = String.valueOf(num[i]);
				r += String.valueOf(num[i+1]);
				r += String.valueOf(num[i+2]);
				int iii = Math.abs(Integer.parseInt(r) - AB);
				if(iii < min) min = iii;
			}
			System.out.println(min);
		}
	}

}
