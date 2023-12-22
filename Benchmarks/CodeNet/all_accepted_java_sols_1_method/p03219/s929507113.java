import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main { 
	public static void main(String[] args) throws Exception { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		/*while((line = in.readLine()) != null){
			int i = Integer.parseInt(line.split(" ",0)[0]);
			int j = Integer.parseInt(line.split(" ",0)[1]);
			System.out.println(i+j/2);
		}}*/
	
		line = in.readLine();
			int i = Integer.parseInt(line.split(" ",0)[0]);
			int j = Integer.parseInt(line.split(" ",0)[1]);
			System.out.println(i+j/2);
		}
	}
