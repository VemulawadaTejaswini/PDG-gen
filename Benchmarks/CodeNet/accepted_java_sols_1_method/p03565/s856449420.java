import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		String str1 = sc.next();
		String[] str2 = sc.next().split("");
		String key = "";
		String key1 = "";
		for(String str : str2) {
			key1 += str;
			key += "[" + str +  "\\?]";
		}
		Pattern p = Pattern.compile(key);
		for(int i = str1.length() - str2.length; i >= 0; i--) {
			Matcher m = p.matcher(str1.substring(i));
			if(m.find()) {
				System.out.println((str1.substring(0,i) + key1 + str1.substring(i + key1.length())).replace("?", "a"));
				//System.out.println(str1.substring(0,i+1) + key + str1.substring(i+1+key.length()));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}