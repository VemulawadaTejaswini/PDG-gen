import java.util.Scanner;

public class Main{
public static void main(String[]  args){
  Scanner stdIn = new Scanner(System.in);
   int n = stdIn.nextInt();
   int x = stdIn.nextInt();
   int t = stdIn.nextInt();
  
  if(n%x == 0){System.out.println(t*(n/x));}
  else {System.out.println(t*(n/x + 1));}
  
}
}