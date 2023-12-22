
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String regex = String.format("[0-9]{%d}-[0-9]{%d}",M,N);		
		Pattern p = Pattern.compile(regex);
		String input = br.readLine();
		Matcher q = p.matcher(input);
		if(q.matches()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
