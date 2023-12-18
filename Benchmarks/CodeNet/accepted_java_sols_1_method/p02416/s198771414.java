import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = 0;
		while(true){
			String line = br.readLine();
			char[] c = line.toCharArray();
			for(int i = 0; i < c.length; i++){
				x += Integer.parseInt("" + c[i]);
			}
			if( x == 0){
				break;
			}else{
				sb.append(x+"\n");
				x = 0;
			}
		}
		System.out.print(sb);
	}
}