import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	String S = sc.next();
    	String T = sc.next();

    	if(T.startsWith(S)) {
        	char[] s = S.toCharArray();
        	char[] t = T.toCharArray();

        	if(s.length + 1 == t.length){
        		char last = t[s.length];
        		String str = String.valueOf(last);
        		String az = "[a-z]";
        		Pattern p = Pattern.compile(az);
        		Matcher m = p.matcher(str);
        		if (m.find()) {
        			System.out.println("Yes");
        		} else {
        			System.out.println("No");
        		}


        	} else {
        		System.out.println("No");
        	}

    	} else {
    		System.out.println("No");
    	}


    }
}