import java.util.*;
public class Main {
  
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  int y = scan.nextInt();
  if(x==y){System.out.println(x+y);}
  else if(x>y){System.out.println(x*2-1);}
  else{System.out.println(y*2-1);}
 }

}
