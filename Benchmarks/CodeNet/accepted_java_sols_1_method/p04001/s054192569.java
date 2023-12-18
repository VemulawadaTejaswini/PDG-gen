import java.util.Scanner;
public class Main {

  static String str;
  static String ans;
  static long sum = 0;
  public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  str = sc.next();
	  char[] charArray = str.toCharArray();

	  for(int bit = 0; bit < Math.pow(2, str.length() -1) ; bit++) {
		  ans = String.valueOf(charArray[0]);
		  for(int i = 0 ; i < str.length() - 1 ;i++) {
			  if((1 & (bit >> i)) == 1) {
				 ans += ",";
			  }
			  ans += String.valueOf(charArray[i+1]);
		  }
		  String num[] = ans.split(",");
			  for(int i = 0; i < num.length;i++) {
				  sum += Long.valueOf(num[i]);
		  }
	  }
	  System.out.println(sum);
	  sc.close();

  }

}