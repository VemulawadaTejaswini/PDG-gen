import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String a1 = scan.next();
    String a2 = scan.next();
    int n = scan.nextInt();
    int m = scan.nextInt();
    String a3 = scan.next();
    if (a1.equals(a3)){
      n -= 1;
    }
    else{
      m -= 1;
    }
    System.out.print(n+" ");
    System.out.println(m);

  }
}
