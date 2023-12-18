import java.util.Scanner;

public class Main {

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    Integer cost = sc.nextInt();
    Double d = Math.ceil(cost/1000.0);
   
    System.out.println(new Double((d*1000)-cost).intValue());
  }
}