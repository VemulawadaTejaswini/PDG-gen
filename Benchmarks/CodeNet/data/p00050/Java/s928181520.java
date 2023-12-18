import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
        Pattern p = Pattern.compile("\\.");
		for(int i = 0 ; i < str.length ; i ++){
	        Matcher m = p.matcher(str[i]);
	        if(m.find()){
	        	if(str[i].substring(0, str[i].length()-1).equals("apple"))
	        		str[i]="peach.";
	        	else if(str[i].substring(0, str[i].length()-1).equals("peach"))
	        		str[i]="apple.";
	        }
	        else{
	        	if(str[i].equals("apple")){
	        		str[i]="peach";
	        	}
	        	else if(str[i].equals("peach")){
	        		str[i]="apple";
	        	}
	        }
		}
		for(int i = 0 ; i < str.length ; i ++){
			System.out.print((i==str.length-1)?str[i]:str[i]+" ");
		}
	}
}