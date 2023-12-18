import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] str = scanner.split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    System.out.println(a*b + " " + (a+b)*2);
  }
}
