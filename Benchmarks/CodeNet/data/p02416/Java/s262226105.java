import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		
		while(true){
			String moji = scan.readLine();
			if(moji.equals ('0')){
				break;
			}
			
			int sum = 0;
			for(int i = 0; i < moji.length(); i++){
				sum+=Character.getNumericValue(moji.charAt(i));
			}
			out.println(sum);
			out.flush();
		}
	}
}