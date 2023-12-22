import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.nextLine();
      for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(str.length()-i-1));
      }
      System.out.println("");
    }
  }
}