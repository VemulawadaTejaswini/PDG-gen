import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String o = sc.nextLine();
    String e = sc.nextLine();

    for(int i = 0; i < e.length(); i++){
      System.out.print(String.valueOf(o.charAt(i)) + String.valueOf(e.charAt(i)));
    }

    if(o.length() > e.length()){
      System.out.print(String.valueOf(o.charAt(o.length()-1)));
    }

    System.out.println("");

  }
}
