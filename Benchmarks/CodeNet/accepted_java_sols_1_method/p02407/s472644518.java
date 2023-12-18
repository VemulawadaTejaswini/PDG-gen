import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int num = Integer.parseInt(reader.readLine());
		String data[] = reader.readLine().split(" ");
		int[] ints = new int[num];
		for(int i=0; i<num; i++){
			ints[i] = Integer.parseInt(data[i]);
		}
		
		builder.append(Integer.toString(ints[num-1]));
		for(int i=2; i<=num; i++){
			builder.append(" ").append(Integer.toString(ints[num-i]));
		}
		
		System.out.println(builder);
		
	}
}