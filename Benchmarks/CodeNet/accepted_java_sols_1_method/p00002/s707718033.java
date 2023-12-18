import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		try {
			Pattern pattern = Pattern.compile("([0-9]+) *([0-9]+)");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			Matcher matcher;
			String temp;
			int sum;
			while((temp = bf.readLine() ) != null){
				if(temp.length()==0)break;
				matcher = pattern.matcher(temp);
				if(matcher.matches()){
					sum=Integer.parseInt(matcher.group(1))+Integer.parseInt(matcher.group(2));
					temp=Integer.toString(sum);
					System.out.println(temp.length());
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}