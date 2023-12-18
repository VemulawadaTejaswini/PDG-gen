import java.util.Scanner;
class Main {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int a = in.nextInt();
  int b = in.nextInt();
  int c = in.nextInt();
  sort(a, b, c);
 }
 static void sort(int a, int b, int c){
  if(a < b && b < c) System.out.println(a + " " + b + " " + c);
  if(a < c && c < b) System.out.println(a + " " + c + " " + b);
  if(b < a && a < c) System.out.println(b + " " + a + " " + c);
  if(b < c && c < a) System.out.println(b + " " + c + " " + a);
  if(c < a && a < b) System.out.println(c + " " + a + " " + b);
  if(c < b && b < a) System.out.println(c + " " + b + " " + a);
 }
}