import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c;
  if(b/10 == 0){c = 10*a + b;}
  else if(b/10 >0 && b/10 <=9){c = 100*a + b;}
  else{c = 1000*a + b;}
  int d = (int)Math.sqrt(c);
  if(d*d == c){System.out.println("Yes");}
  else {System.out.println("No");}
}
}
