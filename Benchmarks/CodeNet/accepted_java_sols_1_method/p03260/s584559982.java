import java.util.Scanner;

public class Main {

  public static void main(String[] args)  {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();

    if (a*b%2==0) System.out.println("No");
    else System.out.println("Yes");


  }

}