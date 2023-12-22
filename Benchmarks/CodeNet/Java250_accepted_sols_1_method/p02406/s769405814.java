import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
 public static void main(String[] args){
	 int n;
	 int k = new java.util.Scanner(System.in).nextInt();
	 String str;
	 Pattern p = Pattern.compile("3");
	
	 for(n=1;n<=k;n++){
		 str  = String.valueOf(n);
		 Matcher m = p.matcher(str);
		 if(n%3==0||m.find()){
			 System.out.print(" "+n);
		 }
		
	 }
	 System.out.println();
 }
}