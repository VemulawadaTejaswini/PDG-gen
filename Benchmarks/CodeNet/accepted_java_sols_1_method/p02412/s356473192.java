import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int a = 0;

		while(true){
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int x = Integer.parseInt(input[1]);

			if( n==0 && x==0 ) break;

			for(int i=1 ; i<=n ; i++ ){
				for(int j=i+1 ; j<=n ; j++ ){
					for(int k=j+1 ; k<=n ; k++ ){
						if( (i+k+j)==x ) a++;
					}
				}
			}
			sb.append(Integer.toString(a)).append("\n");
			a = 0;
		}

		System.out.print(sb);
	}
}