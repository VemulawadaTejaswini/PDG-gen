import java.util.Scanner;
  2 class B4 {
  3 
  4     public static void main(String[] args){
  5         Scanner in = new Scanner(System.in);
  6           int a = in.nextInt();
  7           double c = (double)2*3.14*a;
  8           double b = (double)a*a*3.14;
  9           System.out.println(String.format("%.6f",b) + "  " +String.format("%.6f",c));        
 10     }
 11 }