import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		while((string = reader.readLine()) != null){
			String[] str = string.split("[\\s]+");
			int[] n = new int[3];
			int sum = 0;
			for(int i = 0; i < 3; i++)
				n[i] = Integer.parseInt(str[i]);
			double x = (double)n[0] / n[1];
			String d = String.valueOf((x - (int)x) * Math.pow(10, n[2]));
			for(int i = 0; i < n[2]; i++){
				sum += Integer.parseInt(String.valueOf(d.charAt(i)));
			}
			System.out.println(sum);
		}
		reader.close();
	}
}