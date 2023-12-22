import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      StringBuilder sb = new StringBuilder();
      for(int i = 0;i < s.length();i++){
      	String x = s.substring(i,i+1);
        if(x.equals("0")) sb.append("0");
        if(x.equals("1")) sb.append("1");
        if(x.equals("B") && sb.length() != 0) sb.delete(sb.length()-1,sb.length());
      }
      System.out.println(sb.toString());
    }
}