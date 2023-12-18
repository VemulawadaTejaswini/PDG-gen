import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double takasa = 0;
    double teihen = 0;
    double syahen = 0;
    takasa = sc.nextInt();
    teihen = sc.nextInt();
    syahen = sc.nextInt();
    syahen = 0.5;
      
    double menseki = 0;
    menseki = (teihen * takasa) * syahen;
    int intmenseki = (int)menseki;
    System.out.println(intmenseki);
  }
}