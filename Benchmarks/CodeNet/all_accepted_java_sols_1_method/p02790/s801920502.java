import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scanner = new Scanner(System.in);//new File("input.txt"));
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if(b < a){
      int temp = a;
      a = b;
      b = temp;
    }
    String stringA = Integer.toString(a);
    String ans = "";
    for(int i = 0 ; i < b ; i++)
      ans += stringA;
    System.out.println(ans);
  }
}
