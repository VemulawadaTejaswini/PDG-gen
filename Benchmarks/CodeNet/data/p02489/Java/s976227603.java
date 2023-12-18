import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();

		for(int i = 0 ;  ; i++){
			String str = input.readLine();
			int num = Integer.parseInt(str);
			if(num == 0) break;
		    sb.append("Case " + (i+1) + ": " + num + "\n");
		}
		System.out.print(sb);
	}
}