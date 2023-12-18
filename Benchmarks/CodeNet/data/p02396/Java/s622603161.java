import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i=0;
		while( true ){
			i++;
			int x = Integer.parseInt(br.readLine());
			if(x == 0) break;
			sb.append("cace ").append(Integer.toString(i)).append(": ").append(Integer.toString(x)).append("\n");
		}
		System.out.print(sb);
	}
}