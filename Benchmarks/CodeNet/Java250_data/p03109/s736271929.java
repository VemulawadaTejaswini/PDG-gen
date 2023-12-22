import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String d = sc.next();
    String m = d.substring(5,7);
    if(4<Integer.parseInt(m)){
      System.out.println("TBD");
    }else{
      System.out.println("Heisei");
    }
  }
  

  
}
