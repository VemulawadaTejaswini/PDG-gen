import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next(),t=sc.next();
    if(t.substring(0, s.length()).equals(s)) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
