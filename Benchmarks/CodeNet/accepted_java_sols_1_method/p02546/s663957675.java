import java.util.*;
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
      String val = sc.nextLine();
      String ans = "";

    if(val.endsWith("s")){
      ans = "es";
    }else{
        ans = "s";
    }
    
      System.out.println(val+ans);   
  }
}