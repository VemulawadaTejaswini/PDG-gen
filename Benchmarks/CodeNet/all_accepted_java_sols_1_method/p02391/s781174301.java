import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner inputs = new Scanner(System.in);
    int a = inputs.nextInt();
    int b = inputs.nextInt();
    String ope = "";
    if (a < b) {
      ope = " < ";
    } else if (a > b) {
      ope = " > ";
    } else {
      ope = " == ";
    }
    System.out.println("a" + ope + "b");

  }
}