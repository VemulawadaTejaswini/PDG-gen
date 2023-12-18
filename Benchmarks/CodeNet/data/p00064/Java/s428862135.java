import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static final String regex = "([0-9]+)";
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int sum = 0;
		while((buf = br.readLine()) != null){
			sum += getSumOfNumbersInSentence(buf);
		}
		System.out.println(sum);
	}
	public static int getSumOfNumbersInSentence(String str){
		int sum = 0;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			sum += Integer.parseInt(m.group(1));
		}
		return sum;
	}
}