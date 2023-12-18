import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner;
    String str2[] = str.split(" ");
    int a = Integer.parseInt(str2[0]);
    int b = Integer.parseInt(str2[1]);
    System.out.println(a*b + " " + (a+b)*2);
  }
}
