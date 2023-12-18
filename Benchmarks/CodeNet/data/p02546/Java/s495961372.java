import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    System.out.println(String.valueOf(word.charAt(word.length()-1)));
    if (String.valueOf(word.charAt(word.length()-1)).equals("s")) {
      System.out.println(word + "es");
    } else {
      System.out.println(word + "s");
    }
    sc.close();
  }
}
