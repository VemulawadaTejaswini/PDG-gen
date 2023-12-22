import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int j = 0;

		while( true ){
			String input = br.readLine();

			if( input.equals("0") ) break;

			for( i=0 ; i<input.length() ; i++ ){
				j = j + Integer.parseInt(input.substring(i, i+1));
			}
			sb.append(Integer.toString(j)).append("\n");
			j = 0;
		}
		System.out.print(sb);
	}
}