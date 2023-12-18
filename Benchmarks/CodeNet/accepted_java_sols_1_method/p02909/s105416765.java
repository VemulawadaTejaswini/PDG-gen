import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String N = sc.next();
   if ("Sunny".equals(N)) System.out.println("Cloudy");   
   else if ("Cloudy".equals(N)) System.out.println("Rainy");   
   else if ("Rainy".equals(N)) System.out.println("Sunny");   
   
   
   
 }
}