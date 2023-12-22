import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s1 = scan.next(),s2=scan.next();
    int count = 0;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)!=s2.charAt(i))count++;
    }
    System.out.println(""+count);
  }
}