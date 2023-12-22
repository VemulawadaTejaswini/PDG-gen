import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		int n = Integer.parseInt(line);
		for(int i = 1; i <= n; i++){
			int x = i;
			if( x % 3 == 0 ){
				sb.append(" ").append(i);
			}else{
				do{
					if( x % 10 == 3 ){
						sb.append(" ").append(i);
                                                x = 0;
					}
					x /= 10;
				}while( x != 0 );
			}
		}
		sb.append("\n");
		System.out.print(sb);
	}
}