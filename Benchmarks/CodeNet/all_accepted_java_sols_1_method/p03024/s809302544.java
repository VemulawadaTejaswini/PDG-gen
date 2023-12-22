
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    String s = cin.next();
    int win = 0;
    int lose = 0;
    for (int i=0;i<s.length();i++) {
      if (s.charAt(i)=='o'){
        win++;
      }
      else if (s.charAt(i)=='x'){
        lose++;
      }

      if (lose>=8) {
        System.out.println("NO");
        return;
      }
    }

    System.out.println("YES");

  }

}