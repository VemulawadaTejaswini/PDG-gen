public class Main {
  public static void main(String[] args){
    String str = new java.util.Scanner(System.in).next();
    if (("ABCDEFGHIJKLMNOPQRSTUVWXYZ").indexOf(str) >= 0) {
      System.out.println("A");
    } else {
      System.out.println("a");
    }
  }
}