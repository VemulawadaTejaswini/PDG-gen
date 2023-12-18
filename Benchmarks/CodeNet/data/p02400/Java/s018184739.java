import java.util.Scanner;
  2 class Main {
  3 
  4     public static void main(String[] args){
  5         Scanner in = new Scanner(System.in);
  6           int a = in.nextInt();
  7           double c = (double)2*3.141592653589*a;
  8           double b = (double)a*a*3.141592653589;
  9           System.out.print(String.format("%.6f",b) + "  " + String.format("%.6f",c));        
 10     }
 11 }