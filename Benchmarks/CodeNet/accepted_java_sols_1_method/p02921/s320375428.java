import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int count=0;
    for(int n=0;n<3;n++){
      if(s.charAt(n)==t.charAt(n)){
        count=count+1;
      }
    }
    System.out.println(count);
  }
}
