
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex=sc.nextLine();
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		int count=0;
		while(sc.hasNext()){
			String line=sc.next();
			if(line.equals("END_OF_TEXT")){
				break;
			}
			Matcher m = p.matcher(line);
			if(m.find()){
				count++;
			}


		}
		System.out.println(count);

	}
}
