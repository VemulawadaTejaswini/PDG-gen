import java.util.Scanner;
public class Main{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int k = scan.nextInt();
  int x = 0;
  
  while( n >= Math.pow(k,x)){
    x ++;
  }
  
  System.out.println(x);
}
}
