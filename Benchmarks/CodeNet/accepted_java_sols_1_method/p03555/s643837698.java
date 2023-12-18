import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ue = sc.next();
    String sita = sc.next();
    
    if(ue.charAt(0)==sita.charAt(2)&&ue.charAt(1)==sita.charAt(1)&&ue.charAt(2)==sita.charAt(0)) System.out.println("YES");
    else System.out.println("NO");

  }
}