import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int S = scan.nextInt();
    int h, m, s;
    h = S / (60 * 60);
    S = S % (60 * 60);
    m = S / 60;
    S = S % 60;
    s = S;
    System.out.println(h + ":" + m + ":" + s);
  }
}