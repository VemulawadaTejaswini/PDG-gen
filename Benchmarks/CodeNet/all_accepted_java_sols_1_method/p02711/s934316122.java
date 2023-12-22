import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String n = sc.next();
    
    String n1 = n.substring(0,1);
    String n2 = n.substring(1,2);
    String n3 = n.substring(2,3);
    
    if( (n1.equals("7")) ||(n2.equals("7"))||(n3.equals("7"))){
      System.out.println("Yes");
      return;
    }else{
      System.out.println("No");
    }
  }
}