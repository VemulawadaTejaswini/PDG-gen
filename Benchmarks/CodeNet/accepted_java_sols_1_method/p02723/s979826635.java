import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String coffee = sc.next();
    if(coffee.charAt(2) == coffee.charAt(3) && coffee.charAt(4) == coffee.charAt(5)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
