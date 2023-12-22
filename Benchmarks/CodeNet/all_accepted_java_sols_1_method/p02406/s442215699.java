import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int number = Integer.parseInt(br.readLine());

		for(int i = 1; i <= number; i++){
			String count = String.valueOf(i);
				if(i % 3 == 0 || i % 10 == 3 || count.contains("3")){
					sb.append(" " +i);
				}
			}
		System.out.println(sb);
	}
}