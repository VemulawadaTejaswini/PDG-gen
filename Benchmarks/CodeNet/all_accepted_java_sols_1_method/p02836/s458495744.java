import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = s.length();

    int num = 0;

    for(int i=0; i<a/2; i++){
       if(s.charAt(i) != s.charAt(a-i-1)){
         num++;
       }
    }
    System.out.println(num);
  }
}