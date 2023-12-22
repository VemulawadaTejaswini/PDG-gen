
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    String n = cin.next();
    int countA=0;
    int countB=0;
    for (int i=0;i<3;i++) {
      if (n.charAt(i)=='A'){
        countA++;
      }
      if (n.charAt(i)=='B')
        countB++;
    } 
    if (countA!=0&&countB!=0)
      System.out.println("Yes");
    else 
      System.out.println("No");
  }

}
