import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String st = sc.readLine();
		String s = sc.readLine();
		st += st;
		Pattern p = Pattern.compile(s);
		Matcher matcher = p.matcher(st);
		if(matcher.find()){
			sb.append("Yes\n");
		}else{
			sb.append("No\n");
		}
		System.out.print(sb);
	}
}