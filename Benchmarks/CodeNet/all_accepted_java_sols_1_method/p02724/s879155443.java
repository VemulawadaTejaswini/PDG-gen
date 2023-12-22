import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int kouka = scan.nextInt();

    int syou500,amari500,syou5,uresisa;

    syou500 = kouka/500;
    amari500 = kouka%500;

    syou5 = amari500/5;

    uresisa = syou500*1000 + syou5*5;

    System.out.println(uresisa);
  }
}
