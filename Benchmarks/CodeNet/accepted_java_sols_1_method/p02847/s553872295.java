import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    if(a.equals("SUN")){
      System.out.println(7);
    }
    if(a.equals("MON")){
      System.out.println(6);
    }
    if(a.equals("TUE")){
      System.out.println(5);
    }
    if(a.equals("WED")){
      System.out.println(4);
    }
    if(a.equals("THU")){
      System.out.println(3);
    }
    if(a.equals("FRI")){
      System.out.println(2);
    }
    if(a.equals("SAT")){
      System.out.println(1);
    }
  }
}