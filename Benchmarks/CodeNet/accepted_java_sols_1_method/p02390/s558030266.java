import java.util.Scanner;
class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int S;
  S = sc.nextInt();
  int h;
  h = S/3600;
  int m;
  m = (S%3600)/60;
  int s;
  s = S%60;
  System.out.println(h+":"+m+":"+s);
 }
}
