import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		int n = Integer.parseInt(line);
                //System.out.println(n);
		for(int i = 1; i <= n; i++){
                    //System.out.println(i);
			if( (i % 3 == 0) || (i % 10 == 3) ){
                            //System.out.println(i);
                            sb.append(" ").append(i);
			}
		}
		System.out.print(sb);
	}
}