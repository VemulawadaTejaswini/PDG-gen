import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = a*a*a;
    System.out.println(b);
      scanner.close();
  }
}      
