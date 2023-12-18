import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		Pattern p1= Pattern.compile("[,a-z|.a-z]");
		Matcher m1=p1.matcher(a);
		
		Pattern p2= Pattern.compile("[,A-Z|.A-Z]");
		Matcher m2=p2.matcher(a);
		
		if(m1.find()) {
			String upper_str1 = a.toUpperCase();
			System.out.println(upper_str1);
		}else if(m2.find()){
			 String lower_str1 = a.toLowerCase();
			 System.out.println(lower_str1);
		}else {
			System.out.println(a);
		}
		
	}

}

