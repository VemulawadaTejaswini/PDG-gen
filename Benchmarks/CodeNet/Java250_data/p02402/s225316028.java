import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = br.readLine();
		int a = Integer.parseInt(ans);
		String[] input = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int i = 0;
		long z = 0;
		int[] you = new int[a];

		for( i=0 ; i<a ; i++ ){
			you[i] = Integer.parseInt(input[i]);
			z = z+you[i];
		}

		int x = you[0];
		int y = you[0];

		for ( i=1 ; i<a ; i++ ){
			if( you[i]>x ) x = you[i];
			if( you[i]<y ) y = you[i];
		}
		sb.append(y).append(" ").append(x).append(" ").append(z);
		System.out.println(sb);
	}
}