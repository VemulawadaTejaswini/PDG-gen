import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().toLowerCase();
		StringBuffer ss=new StringBuffer();
		while(true){
			String m=br.readLine();
			if(m.equalsIgnoreCase("END_OF_TEXT"))
				break;
			else{
				ss.append(m+" ");
			}
		}
		Pattern p=Pattern.compile(s);
		Matcher matcher=p.matcher(ss.toString().toLowerCase());
		int c=0;
		while(matcher.find())
			c++;
		System.out.println(c);

	}

}