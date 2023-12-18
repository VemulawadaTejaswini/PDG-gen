import java.io.*;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i;
		for( i=1 ; ; i++){
			int x = Integer.parseInt(br.readLine());
			if(x == 0) break;
			sb.append("cace ").append(Integer.toString(i)).append(": ").append(Integer.toString(x)).append("\n");
		}
		System.out.print(sb);
	}
}