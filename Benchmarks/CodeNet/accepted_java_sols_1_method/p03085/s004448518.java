import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String a = s.next();

    if(a.contains("A")){
      System.out.println("T");
    }else if(a.contains("T")){
      System.out.println("A");
    }else if(a.contains("C")){
      System.out.println("G");
    }else if(a.contains("G")){
      System.out.println("C");
    }
  }
}
