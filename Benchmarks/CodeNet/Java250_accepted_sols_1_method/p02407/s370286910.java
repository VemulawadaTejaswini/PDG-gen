import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String lineN = br.readLine();
		String[] lineA = br.readLine().split(" ");
		int n = Integer.parseInt(lineN);
 		for(int i = n-1 ; i >= 0 ; i--){
                 	int a = Integer.parseInt(lineA[i]);
			sb.append(a);
			if(i != 0) sb.append(" ");
		}
		System.out.println(sb);
	} 
}