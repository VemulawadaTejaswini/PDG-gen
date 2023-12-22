import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long k =sc.nextLong()-1;
    int st=0;
    while(s.length()>st && s.charAt(st)=='1') st++;
    System.out.println(k<st?'1':s.charAt(st));
  }
}
