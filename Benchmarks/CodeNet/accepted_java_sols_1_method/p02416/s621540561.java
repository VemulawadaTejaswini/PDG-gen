import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		String str;
		while(!(str = br.readLine()).equals("0")){
			int sum=0;
			for(int i=0; i<str.length();i++){
				sum += Integer.parseInt(str.substring(i, i+1));
			}
			builder.append(sum + "\n");
		}
		builder.delete(builder.length() -1 , builder.length());

		System.out.println(builder);
	}
}