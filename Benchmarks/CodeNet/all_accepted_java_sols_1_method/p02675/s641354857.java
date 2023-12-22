import java.util.*;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if(s == null) System.out.println("");
    else{
     	char c = s.charAt(s.length()-1);
    	String str;
		if(c == '2' || c == '4' || c == '5' || c == '7' || c == '9') str = "hon";
    	else if(c == '0' ||c == '1' || c == '6' || c =='8') str = "pon";
    	else str = "bon";
		System.out.println(str);
    }
  }
}
