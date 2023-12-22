import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String s = br.readLine();
	    String p = br.readLine();

	    String targetStr = s + s;
	    StringBuilder sb = new StringBuilder();
        Pattern ptn = Pattern.compile(p);
        Matcher matcher = ptn.matcher(targetStr);
        if(matcher.find()){
            sb.append("Yes");
        }else{
            sb.append("No");
        }
        System.out.println(sb.toString());
	}
}