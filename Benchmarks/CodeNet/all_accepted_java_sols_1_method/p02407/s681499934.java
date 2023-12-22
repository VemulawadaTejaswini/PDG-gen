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
		String[] reinput = sb.readLine().split(" ");
		StringBuffer br = new StringBuffer();
		int[] sainput = new int[g];

		for( i=0 ; i<g ; i++ ){
			sainput[i] = Integer.parseInt(reinput[i]);
		}

		g--;
		j = g;

		if(g%2==1){
			for( i=0 ; i<=j/2 ; i++ ){
					t = sainput[i];
					sainput[i]=sainput[g];
					sainput[g]=t;
					g--;
			}
		}else{
			for( i=0 ; i<j/2 ; i++ ){
					t = sainput[i];
					sainput[i]=sainput[g];
					sainput[g]=t;
					g--;
			}
		}

		for( i=0 ; i<=j ; i++){
			br.append(sainput[i]);
			if( i==j ) break;
			br.append(" ");
		}
		System.out.println(br);
	}
}