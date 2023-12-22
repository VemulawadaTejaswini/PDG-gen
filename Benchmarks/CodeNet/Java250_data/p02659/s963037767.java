import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    double b = scan.nextDouble();
    if ((a == 0) || (b==0)){
      System.out.println("0");
      return;
    }
    String t = b+"";
    long t2 = 0;
    long t3 = 0;

    long t1 = Integer.parseInt(String.valueOf(t.charAt(0)));
    if (t.length()>=3){
      t2 = Integer.parseInt(String.valueOf(t.charAt(2)));
    }
    if (t.length()>=4){
      t3 = Integer.parseInt(String.valueOf(t.charAt(3)));
    }
    long c = (a*t1*100)+(a*t2*10)+(a*t3);
    String g = c+"";
    if (g.length()<=2){
      System.out.println("0");
      return;
    }

    for (int i=0;i<g.length()-2;i++){
      System.out.print(g.charAt(i));
    }
    System.out.println("");
  }
}
