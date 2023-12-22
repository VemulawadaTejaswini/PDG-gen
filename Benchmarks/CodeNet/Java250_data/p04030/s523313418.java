import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] s = sc.next().split("");
      StringBuilder sb = new StringBuilder();
      for(String t:s){
        if(t.equals("0")){
          sb.append("0");
        }
        if(t.equals("1")){
          sb.append("1");
        }
        if(t.equals("B")){
          if(sb.length() > 0){
            sb.deleteCharAt(sb.length()-1);
          }
        }
      }
      
      System.out.println(sb.toString());
    }
}