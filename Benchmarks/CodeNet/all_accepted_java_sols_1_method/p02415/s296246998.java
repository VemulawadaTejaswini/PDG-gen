import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		Pattern upperStr = Pattern.compile("[A-Z]");
		Pattern lowerStr = Pattern.compile("[a-z]");

		String str = br.readLine();
		for(int i=0; i<str.length();i++){
			String checkStr = str.substring(i, i+1);
			if(upperStr.matcher(checkStr).find()){
				builder.append(checkStr.toLowerCase());
			}else if(lowerStr.matcher(checkStr).find()){
				builder.append(checkStr.toUpperCase());
			}else{
				builder.append(checkStr);
			}
		}

		System.out.println(builder);
	}
}