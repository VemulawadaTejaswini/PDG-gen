import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = Integer.parseInt(sc.next());
  int b = Integer.parseInt(sc.next());
  if ((a+b)%2==0){
    System.out.println((a+b)/2);
  }
  else {
    int ans = (a+b)/2;
    System.out.println(ans+1);
  }
  }
}
