import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input = br.readLine();
		if(((input.indexOf("N")!=-1) == (input.indexOf("S")!=-1)) && ((input.indexOf("W")!=-1) == (input.indexOf("E")!=-1))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
