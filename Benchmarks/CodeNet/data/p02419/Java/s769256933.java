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
		String s;
		int count = 0;
		Pattern p = Pattern.compile(st);
		while(true){
			s = sc.readLine().toLowerCase();
			Matcher matcher = p.matcher(s);
			if(s.equals("END_OF_TEXT")){
				break;
			}
			while(matcher.find()){
				count++;
			}
		}
		sb.append(count+"\n");
		System.out.print(sb);
	}
}	String s;
		int count = 0;
		Pattern p = Pattern.compile(st);
		while(true){
			s = sc.readLine().toLowerCase();
			Matcher matcher = p.matcher(s);
			if(s.equals("END_OF_TEXT")){
				break;
			}
			while(matcher.find()){
				count++;
			}
		}
		sb.append(count+"\n");
		System.out.print(sb);
	}
}