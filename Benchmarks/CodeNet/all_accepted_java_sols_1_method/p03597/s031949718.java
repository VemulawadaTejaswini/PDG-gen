import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int n=scanner.nextInt();
  int a=scanner.nextInt();
  scanner.close();
  System.out.println(n*n-a);
 }
}
