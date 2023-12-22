import java.util.Scanner;

public  class Main {

  public static void main(String[] args) {

    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    int b = sin.nextInt();

    sin.close();
    
    System.out.println(a*b + " " + (a+b)*2);
  }
}
