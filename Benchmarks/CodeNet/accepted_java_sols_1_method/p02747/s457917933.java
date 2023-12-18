import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		Pattern p = Pattern.compile("^(hi)+$");
		Matcher m = p.matcher(line);
		if(m.find()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");			
		}
	}
}