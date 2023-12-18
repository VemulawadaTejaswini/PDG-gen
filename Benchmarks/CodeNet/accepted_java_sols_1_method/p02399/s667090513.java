import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] x = str.split(" ");
    int a = Integer.parseInt(x[0]);
    int b = Integer.parseInt(x[1]);
    int d = a/b;
    int r = a%b;
    double n = (double)a/b;
    String f = String.format("%.8f", n);
    System.out.println(d + " " + r + " " + f);
  }
}
