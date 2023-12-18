import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s,ans;
	   s = br.readLine();
	   Matcher m = Pattern.compile("apple").matcher(s);
	   s = m.replaceAll("tmp");
	   Matcher ms = Pattern.compile("peach").matcher(s);
	   s = ms.replaceAll("apple");
	   Matcher mf = Pattern.compile("tmp").matcher(s);
	   s = mf.replaceAll("peach");
	   System.out.println(s);
   }
}