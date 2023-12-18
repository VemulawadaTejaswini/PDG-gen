import java.util.Scanner;
public  class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String a = stdIn.next();
  
    if(Character.isUpperCase(a.charAt(0))){
      System.out.println("A");
    			}
      else
        System.out.println("a");

  }
}