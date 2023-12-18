import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String key = br.readLine();
		int count=0;
		Pattern p = Pattern.compile(key,Pattern.CASE_INSENSITIVE);
		String line=br.readLine();
		while(!line.equals("END_OF_TEXT")){
			Matcher m = p.matcher(line);
			if(m.find())
				count++;	
			line=br.readLine();
		}
		System.out.println(count);
	}
}