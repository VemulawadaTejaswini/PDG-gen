import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.readLine();
    String[] x = str.split(" ");
    int a = x[0];
    int b = x[1];
    int d = a/b;
    int r = a%b;
    float f = a/b;
    System.out.println(d + " " + r + " " + f);
  }
}
