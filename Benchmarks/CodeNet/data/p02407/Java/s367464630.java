import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		String input = sb.readLine();
		int g = Integer.parseInt(input);
		int i = 0;
		int j = 0;
		int t = 0;
		input = sb.readLine();
		String[] reinput = input.split(" ");
		StringBuffer br = new StringBuffer();
		int[] sainput = new int[g];

		for( i=0 ; i<g ; i++ ){
			sainput[i] = Integer.parseInt(reinput[i]);
		}

		for( i=0 ; i<g ; i++ ){
			for( j=i+1 ; j<g ; j++){
				if( sainput[j]>sainput[i] ){
					t = sainput[i];
					sainput[i]=sainput[j];
					sainput[j]=t;
				}
			}
		}

		for( i=0 ; i<g ; i++){
			br.append(sainput[i]);
			if( i==g-1 ) break;
			br.append(" ");
		}
		System.out.println(br);
	}
}