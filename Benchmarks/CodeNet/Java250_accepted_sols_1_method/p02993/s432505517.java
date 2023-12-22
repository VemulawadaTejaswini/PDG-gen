import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System. in);
    String passWord = sc.next();
    String ans = "";

    for (int i=0; i < passWord.length()-1; i++) {
      if (passWord.substring(i, i + 1).equals(passWord.substring(i+1, i+2))) {
        ans = "Bad";
        break;
      } else {
        ans = "Good";
      }
    }

    System.out.println(ans);
  }
}
