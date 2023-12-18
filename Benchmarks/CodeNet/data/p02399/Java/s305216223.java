import java.util.*;
 class Main {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int d = a/b;
  int r = a%b;
  float s = (float)a/(float)b;
  String f = String.format("%.5f",s);
  System.out.println(d +" "+r+" "+f);
 }
}