import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    for(int i = 0;i<s.length;i++){
      if(s[i].equals("1"))s[i] = "9";
      else if(s[i].equals("9"))s[i] = "1";
      System.out.print(s[i]);
    }
  } 
}