import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    long n = cin.nextLong();
    long a = cin.nextLong();
    long b = cin.nextLong();
    long count = n/(a+b);
    long remain = n%(a+b);
    if (remain >= a)
      remain = a;
  
    System.out.println(count*a+remain);
  }

}