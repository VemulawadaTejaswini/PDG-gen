import java.util.*;

public class Main{
public static void main(String[] args) {
  String a = "AAA";
  String b = "BBB";
  Scanner sc = new Scanner(System.in);
//  System.out.print("S: ");
  String s = sc.next();

  if(s.equals(a) || s.equals(b)){
    System.out.println("No");
  }else{
    System.out.println("Yes");
  }
}
}
