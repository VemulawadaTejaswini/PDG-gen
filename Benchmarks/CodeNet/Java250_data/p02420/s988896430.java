import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		while(true){
			String mountain = br.readLine();

			if( mountain.equals("-")) break;

			int m = Integer.parseInt(br.readLine());
			int i = 0;

			for( i=0 ; i<m ; i++ ){
				int h = Integer.parseInt(br.readLine());
				sb2.append(mountain.substring(h, mountain.length())).append(mountain.substring(0, h));
				mountain = sb2.toString();
				sb2.setLength(0);
			}

			sb.append(mountain).append("\n");
		}

		System.out.print(sb);
	}
}