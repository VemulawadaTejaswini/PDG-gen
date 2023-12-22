import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String a="ABC";
    String b=scan.next();
    if(a.equals(b)){
      System.out.println("ARC");
    }else{
      System.out.println("ABC");
    }
  }
}