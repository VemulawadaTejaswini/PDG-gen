import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {
 void run(){
  Scanner sc = new Scanner(System.in);
  while(sc.hasNext()) {
   int n =sc.nextInt();
   int min, max;
   for(max=p-1;!isP(max);max--);
   for(min=p+1;!isP(min);min++);
   System.out.println(max + " " + min);
  }
 }
 boolean isP(int p) {
  for(int i=2;i*i<=p;i++) if(p%i == 0)
   return false;
  return true;
 }
 public static void main (String[] args ) {
  new Main().run();
 }
}