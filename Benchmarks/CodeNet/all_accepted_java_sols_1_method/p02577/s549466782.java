import java.util.*;

public class Main{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
  	String i = scanner.next();
  	char[] chars = i.toCharArray();
  	int sum = 0;
  	for(char c : chars){
    	sum += Integer.valueOf(c+"");
    }
  	String res = sum % 9 == 0 ? "Yes" : "No";
  System.out.println(res);
}
}